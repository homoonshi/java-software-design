package cohesion.procedural;

public class UserProcess {
    public static void main(String[] args) {
        User user = new UserDataCollector().collectUserData();
        if(EmailValidator.emailValid(user.getMail())){
            EmailSender.sendEmail(user.getMail(), "Message");
        }else{
            System.out.println("User Email is not valid");
        }
    }
}
