package composicao.fixacao.application;

import composicao.fixacao.entities.Client;
import composicao.fixacao.entities.Order;
import composicao.fixacao.entities.OrderItem;
import composicao.fixacao.entities.Product;
import composicao.fixacao.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        sc.nextLine();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();

        Order order = new Order(birthDate, OrderStatus.valueOf(orderStatus), new Client(name, email, birthDate));

        System.out.print("How many items to this order? ");
        int items = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= items; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: " );
            int productQuantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);
        }

        System.out.println(order);

        sc.close();

    }
}
