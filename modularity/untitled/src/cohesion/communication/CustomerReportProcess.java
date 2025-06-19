package cohesion.communication;

public class CustomerReportProcess {
    public static void main(String[] args) {
        Customer customer = CustomerLoader.loadCustomer(1);

        if(CustomerValidator.validateCustomer(customer)){
            CustomerReportGenerator.generateReport(customer);
        }
    }
}
