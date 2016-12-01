package test1.car;



/**
 * Created by acer on 03.09.2016.
 */
public class Car {
    private String model;
    private String color;
    private Integer year;
    private Integer milage;
    //онструктор
    //явный конструктор по умолчанию
    public Car(){
        model = "Hundai";
        color = "black";
        year = 2016;
    }
    //public Car(String model){
    //   this.model = model;
    //  color = "black";
    // year = 2016;}

    public Car(String model, String color, Integer year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public Car(String model, String color){
        model = "Honda";
        color = "Black";

    }

    public void about(){
        System.out.println("Model:" + model);
        System.out.println("Color:" + color);
        System.out.println("Year:" + year);

    }
}
