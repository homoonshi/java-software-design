package cohesion.sequential;

import java.util.Date;
import java.util.UUID;

public class Payment {
    private UUID paymentId;
    private PaymentStatus paymentStatus;
    private double amount;
    private Date paymentDate;

    public Payment() {
        this.paymentId = UUID.randomUUID();
        this.paymentStatus = PaymentStatus.OPEN;
        this.amount = 0;
        this.paymentDate = new Date();
    }

    public void addAmount(double price){
        this.amount += price;
    }

    public PaymentStatus performPayment(){
        this.paymentStatus = PaymentStatus.PAID;
        this.paymentDate = new Date();
        return this.paymentStatus;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
}
