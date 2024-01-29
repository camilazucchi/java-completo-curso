package herancaPolimorfismo.application;

import herancaPolimorfismo.entities.ImportedProduct;
import herancaPolimorfismo.entities.Product;
import herancaPolimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ProductMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'c') {
                Product product = new Product(name, price);
                products.add(product);
            } else if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            } else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product product = new UsedProduct(name, price, manufactureDate);
                products.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
