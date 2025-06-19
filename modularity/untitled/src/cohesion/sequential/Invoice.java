package cohesion.sequential;

import java.util.Date;
import java.util.UUID;

public class Invoice {

    private UUID invoiceId;
    private Date invoiceDate;
    private double amount;

    public Invoice(double amount) {
        this.invoiceId = UUID.randomUUID();
        this.invoiceDate = new Date();
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId=" + invoiceId +
                ", invoiceDate=" + invoiceDate +
                ", amount=" + amount +
                '}';
    }
}
