package stream.streamorder;

import java.util.List;

/**
 *     Find out 3 products with maximum ratings.
 *     Sort products by :
 *     (i) product ratings.
 *        If more than 1 products have same number of ratings
 *     (ii) sort by names
 */

public class Customer {
    private String customerName;
    private List<Order> orders;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerName='" + customerName + '\'' + ", orders=" + orders + '}';
    }
}
