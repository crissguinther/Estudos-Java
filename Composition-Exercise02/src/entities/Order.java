package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	private Client client;

	private List<OrderItem> items = new ArrayList<>();

	public Order() {
		this.moment = new Date();
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = new Date();
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void additem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double totalPrice() {
		Double sum = 0.0;
		for (OrderItem o : items) {
			sum += o.subTotal();
		}

		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sdf.applyPattern("dd/MM/yyyy");
		sb.append("Client: " + client.getName() + " " + sdf.format(client.getBirthDate()) + " - " + client.getEmail()
				+ "\n");
		sb.append("Order items: \n");
		for (OrderItem o : items) {
			sb.append(o.getProduct().getName());
			sb.append(", $" + o.getProduct().getPrice());
			sb.append(", Quantity: " + o.getQuantity());
			sb.append(", Subtotal: $" + o.subTotal() + "\n");
		}
		sb.append("Total price: $" + totalPrice());

		return sb.toString();
	}

}
