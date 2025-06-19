package cohesion.communication;

public class CustomerValidator {
    public static boolean validateCustomer(Customer customer) {
        return customer.getName() != null;
    }
}
