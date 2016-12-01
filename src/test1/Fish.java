package test1;

/**
 * Created by diana on 09.11.16.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;


public class Fish extends Product {

    private int price;
    private int bar; // штрихкод

    private Boolean swim = false;
    private Fish fish;
    SimpleDateFormat str = new SimpleDateFormat("yyyy MMM dd");
    Calendar startDate = new GregorianCalendar(2016, 9 , 30);
    SimpleDateFormat str2 = new SimpleDateFormat("yyyy MMM dd");
    Calendar lastDate = new GregorianCalendar(2016, 10 , 03);


    public Fish(String type, int price, int bar ) {
        super(type);
        this.price = price;
        this.bar = bar;




    }
    @Override
    public void printPrice() {

        setPrice(this.price = price);
        System.out.println("Цена:"+ price);
    }
    @Override
    public void printStoragePeriod() {

        if(startDate.before( lastDate )) {
            System.out.println("Срок годности рыбы от :" + str.format(startDate.getTime())); // не выводит значения календаря

            System.out.println("Срок годности рыбы до:" + str2.format(lastDate.getTime()));// не выводит значения календаря
        }

    }
    @Override
    public void printBarAndPrice() {
        setBar(this.bar= bar);
        setPrice(this.price= price);
        System.out.println("Цена+ штрих-код:"+ " " + price+ " " + " " +bar);
    }
    public void swim(){
        if(!swim){
            swim = true;
        }
        System.out.println("Рыба поплыла"+ swim);
    }
    public void cannibalism(){
        if(fish ==null){
            System.out.println("Рыбы сьела рыбу");
        }
    }
}
