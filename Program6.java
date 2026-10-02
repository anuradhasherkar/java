class ECommerceException extends Exception {
    ECommerceException(String message) {
        super(message);
    }
}

class PaymentException extends ECommerceException {
    PaymentException(String message) {
        super(message);
    }
}

class InventoryException extends ECommerceException {
    InventoryException(String message) {
        super(message);
    }
}

class ShippingException extends ECommerceException {
    ShippingException(String message) {
        super(message);
    }
}

class Order {
    void payment(double amount) throws PaymentException {
        if (amount <= 0)
            throw new PaymentException("Invalid payment amount");

        System.out.println("Payment successful");
    }

    void checkInventory(int quantity) throws InventoryException {
        int available = 5;

        if (quantity > available)
            throw new InventoryException("Insufficient inventory");

        System.out.println("Inventory available");
    }

    void shipping(String address) throws ShippingException {
        if (address == null || address.isEmpty())
            throw new ShippingException("Invalid shipping address");

        System.out.println("Shipping confirmed");
    }
}

public class Program6 {
    public static void main(String[] args) {
        Order order = new Order();

        try {
            order.payment(1000);
            order.checkInventory(3);
            order.shipping("Jalgaon");

            System.out.println("Order placed successfully");
        } catch (PaymentException e) {
            System.out.println("Payment Error: " + e.getMessage());
        } catch (InventoryException e) {
            System.out.println("Inventory Error: " + e.getMessage());
        } catch (ShippingException e) {
            System.out.println("Shipping Error: " + e.getMessage());
        }
    }
}
