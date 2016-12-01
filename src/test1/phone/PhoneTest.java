package test1.phone;

/**
 * Created by diana on 13.11.16.
 */

public class PhoneTest {
    public static void main (String[]args){
        Simcard simCard = new Simcard("Vodafon", 9689298, 0, 2,10);
        Phone phone = new Phone ("China no name", simCard);
        Phone phone2 = new Phone("China no name", "OS", simCard);


        phone.about();

        phone.newContact("Петров", 9678);
        phone.newContact("Васильев", 9678);
        phone.newContact("Васильев", 9678);

        phone.printContacts();
    }


}