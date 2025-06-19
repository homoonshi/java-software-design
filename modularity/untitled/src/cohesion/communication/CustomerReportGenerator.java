package cohesion.communication;

public class CustomerReportGenerator {
    public static void generateReport(Customer customer) {
        System.out.println("Report for customer: " +customer.getName());
    }
}
