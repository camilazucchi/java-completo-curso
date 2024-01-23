package enumeracoes;

import enumeracoes.entities.Order;
import enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);

    }
}
