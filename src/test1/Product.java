package test1;


/**
 * Created by acer on 12.09.2016.
 */
public class Product {
    private String type;
    private int price;
    private int bar; // штрихкод
    private int storage_period;


    public Product(String type) {
        this.type = "Продукт";
    }

    public Product(int price, int bar, int storage_period) {

        this.price = price;
        this.bar = bar;
        this.storage_period = storage_period;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

    public int getStorage_period() {
        return storage_period;
    }

    public void setStorage_period(int storage_period) {
        this.storage_period = storage_period;
    }

    public void printPrice()
    {   getPrice();
        System.out.println("Цена:"+ price);
    }
    public void printStoragePeriod(){
        getStorage_period();
        System.out.println("Срок годности:" + storage_period);
    }
    public void printBarAndPrice(){
        getBar();
        getPrice();

        System.out.println("Штрих-код+цена:" +" "+ bar+" "+  price);
    }
}

