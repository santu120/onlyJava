package stream.streamorder;

import java.util.List;

public class Order {

    private List<Product> items;
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" + "items=" + items + ", orderId='" + orderId + '\'' + '}';
    }
}
