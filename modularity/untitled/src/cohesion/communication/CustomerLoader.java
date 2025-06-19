package cohesion.communication;

public class CustomerLoader {

    public static Customer loadCustomer(int id){
        return new Customer(id, "대충고객불러오는메서드");
    }

}
