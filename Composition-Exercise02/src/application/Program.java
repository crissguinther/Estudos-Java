package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String clientName = sc.next();
		sc.nextLine();
		
		System.out.print("Email: ");
		String clientEmail = sc.next();
		sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirthDate = sdf.parse(sc.next());
		sc.nextLine();

		Client client = new Client(clientName, clientEmail, clientBirthDate);
		Order order = new Order();
		order.setClient(client);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		order.setStatus(OrderStatus.valueOf(sc.next()));
		sc.nextLine();

		System.out.print("How many items to this order? ");
		Integer ammountOfItems = sc.nextInt();

		for (int i = 1; i <= ammountOfItems; i++) {
	
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			sc.nextLine();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem orderItem = new OrderItem(quantity, product);
			order.additem(orderItem);
			
		}

		System.out.println(order.toString());
		
		sc.close();

	}

}
