package cohesion.sequential;

public class InvoiceGenerator {
    public static Invoice generateInvoice(Payment payment){
        return new Invoice(payment.getAmount());
    }
}
