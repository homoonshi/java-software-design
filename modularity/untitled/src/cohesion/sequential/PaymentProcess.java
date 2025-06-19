package cohesion.sequential;

public class PaymentProcess {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("item1", 19.11));
        shoppingCart.addItem(new Item("item2", 29.22));
        shoppingCart.addItem(new Item("item3", 39.33));

        Payment payment = PaymentProceesor.processPayment(shoppingCart);

        if(payment.getPaymentStatus() == PaymentStatus.PAID){
            Invoice invoice = InvoiceGenerator.generateInvoice(payment);
            System.out.println("invoice = " + invoice);
        }else{
            System.out.println("Payment Failed");
        }
    }
}
