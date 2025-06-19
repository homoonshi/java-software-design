package cohesion.coincidental;

public class CoincidentalCohesion {
    public void emailSender(String recipient, String meesage){
        System.out.println("send to "+recipient+" message: "+meesage);
    }
    public double calculateTax(double amount){
        return amount * 0.1;
    }
}
