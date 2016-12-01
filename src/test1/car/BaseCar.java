package test1.car;

/**
 * Created by diana on 09.11.16.
 */


public class BaseCar {
    private String model;
    private String color;
    private Integer year;
    private Integer milage;

    public BaseCar(String model,String color,Integer year ){
        this.model = model;
        this.color = color;
        this.year = year;
        milage = 0;
    }
    public BaseCar(String model,String color)
    {
        this(model, color, null);
    }// перевызов
    public BaseCar(String model) {
        this(model, "Beliy", 2010);
    }
}

