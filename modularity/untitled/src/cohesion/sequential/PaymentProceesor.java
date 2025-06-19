package cohesion.sequential;

public class PaymentProceesor {
    public static Payment processPayment(ShoppingCart shoppingCart){
        Payment payment = new Payment();
        shoppingCart.getItems().forEach(item -> {
            payment.addAmount(item.getPrice());
        });
        payment.performPayment();
        return payment;
    }
}
