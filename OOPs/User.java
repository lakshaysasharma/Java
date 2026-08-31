package OOPs;

public class User {

    public static void main(String[] args) {
        OOPs.Account account1 = new OOPs.Account();
        account1.name = "Lakshay";
        account1.email = "lakshay@gmail.com";
        account1.age = 22;

        account1.setNickname("Laksh");
        

        System.out.println(account1.name);
        System.out.println(account1.email);
        System.out.println(account1.age);
        System.out.println(account1.getNickname());
    }
    
}
