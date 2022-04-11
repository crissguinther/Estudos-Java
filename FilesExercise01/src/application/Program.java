package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import entities.TextWriter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String strPath = "/media/crissguinther/Armazenamento/Documentos/exercicios/in.txt";

		List<Product> products = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

			String line = br.readLine();

			while (line != null) {
				products.add(new Product(line));
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error:" + e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			e.getMessage();
		}

		Path directory = Paths.get(strPath).getParent();

		try {
			TextWriter tw = new TextWriter(products, directory);
			tw.writeFiles("/summary.csv");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
