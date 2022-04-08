package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of products: ");
		int n = sc.nextInt();
		List<Product> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println(String.format("Enter #%d product date", i));

			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);

			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();

			System.out.print("Price: ");
			Double price = sc.nextDouble();

			switch (type) {

			case 'c':
				list.add(new Product(name, price));
				break;

			case 'i':
				System.out.print("Custom fee: ");
				Double cf = sc.nextDouble();
				list.add(new ImportedProduct(name, price, cf));
				break;

			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY)");
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

				Date manufactureDate = null;
				try {
					manufactureDate = sdf.parse(sc.next());
				} catch (ParseException e) {
					e.printStackTrace();
				}
				sc.nextLine();

				list.add(new UsedProduct(name, price, manufactureDate));
				break;

			}

		}

		for(Product product : list) {
			System.out.println(product.priceTag());
		}
		
		sc.close();

	}

}
