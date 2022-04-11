package entities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Product {

	List<String> info = new ArrayList<>();

	public Product(String str) throws IOException {
		for (String info : str.split(",")) {
			this.info.add(info);
		}
	}

	public int getQuantity() {
		return Integer.valueOf(info.get(info.size() - 1).replaceAll(" ", ""));
	}

	public double getPrice() {
		return Double.valueOf(info.get(1).replaceAll(" ", ""));
	}

	public String getName() {
		return info.get(0);
	}

	public Double getTotal() {
		return (getPrice() * getQuantity());
	}

	public List<String> getInfo() {
		return info;
	}

	public String getSingleInfo(int index) {
		return info.get(index);
	}

	@Override
	public String toString() {
		return getName() + ", " + String.format("%.2f", getTotal());
	}
}
