package composicao.fixacao.entities;


import composicao.fixacao.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment = new Date();
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
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

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem it : items) {
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ORDER SUMMARY\n");
        stringBuilder.append("Order moment: ").append(sdf.format(moment)).append("\n");
        stringBuilder.append("Order status: ").append(status).append("\n");
        stringBuilder.append("Client: ").append(client).append("\n");
        stringBuilder.append("Order items:\n");
        for (OrderItem item : items) {
            stringBuilder.append(item).append("\n");
        }
        stringBuilder.append("Total price: $").append(String.format("%.2f", total()));
        return stringBuilder.toString();
    }
}
