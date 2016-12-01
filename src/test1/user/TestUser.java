package test1.user;

/**
 * Created by diana on 10.11.16.
 */

public class TestUser {
    public static void main (String[]arg){
        User user = new User("Name", "Surname", 100,  "Password");
        System.out.println(user);
        System.out.println(user.hashCode());
        user.setName ("Vasiliy");
        user.setSurname("Vitaliy");

        System.out.println(user.hashCode());


    }}

