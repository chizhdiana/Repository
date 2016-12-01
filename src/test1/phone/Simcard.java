package test1.phone;

/**
 * Created by diana on 13.11.16.
 */

public class Simcard {
    private String operator;
    private Integer number;
    private Integer pricemin;
    private Integer pricesms;
    private Integer account;

    public Simcard(String operator, Integer number,Integer pricemin , Integer pricesms,Integer account){
        this.operator = operator;
        this.number = number;
        this.pricemin = pricemin;
        this.pricesms = pricesms;
        this.account = account;

    }
    public void about(){
        System.out.print ("Оператор:" + operator + " \n" + "Телефон:" + number );}
}

