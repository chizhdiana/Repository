package test1.phone;

/**
 * Created by diana on 13.11.16.
 */


public class Contact {
    private String name;
    private Integer number;


    public Contact(String name, Integer number){
        this.name = name;
        this.number = number;
    }
    public void about(){
        System.out.println("Имя" + name +"Номер" + number );
    }



}
