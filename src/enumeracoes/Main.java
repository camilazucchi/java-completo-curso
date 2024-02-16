package enumeracoes;

import enumeracoes.entities.Order;
import enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);

        // Cria uma variável chamada "orderStatus" e a configura com o valor "DELIVERED" do enum "OrderStatus".
        // OrderStatus é um enum!
        OrderStatus orderStatus1 = OrderStatus.DELIVERED;
        // Usa o método estático fornecido automaticamente pelo Java para enums. Ele retorna a constante do enum
        // cujo nome é fornecido como uma string. Neste caso, está buscando a constante associada à string "DELIVERED".
        OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");
        // Notação UML.

        System.out.println(orderStatus1);
        System.out.println(orderStatus2);



    }
}
