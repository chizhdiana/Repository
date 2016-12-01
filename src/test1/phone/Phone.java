package test1.phone;
import java.util.ArrayList;

/**
 * Created by diana on 13.11.16.
 */

public class Phone {
    private String model;
    private String OS;

    private  Simcard simCard ;
    private ArrayList <Contact> contacts;
    private Integer ballans;

    public Phone(String model) {
        this.model = model;

    }

    public Phone(String model, String OS, Simcard simCard){
        this.model = model;
        this. OS = OS;
        this.simCard = simCard;
        contacts = new  ArrayList<>();
        ballans =0;
    }

    public Phone(String model, Simcard simCard) {
        this(model, "No OS", simCard);
    }



    public void about(){
        System.out.println("Модель:" +" "+ model );
        simCard.about();

    }


    // добавляем контакты в тел книгу
    public void newContact(String name,  Integer phone){
        Contact contact = new Contact(name, phone);

        contacts.add(contact);

    }
    public void printContacts(){ // аполняет контактами
        if(contacts.size()>0){
            for(Contact contact:contacts){

                contact.about();

            }
            return;
        }
    }
    public void fillBalans(int addmoney) {
        if (addmoney > 0) {

            for (int i = ballans; ballans >= 0; ballans++) {
                ballans += addmoney;

            }
            System.out.println(ballans);
        }

    }
    public void setModel(String model){
        this.model = model;
    }


    public String getModel(){
        return model;
    }


}


