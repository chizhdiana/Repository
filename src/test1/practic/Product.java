package test1.practic;

/**
 * Created by diana on 10.11.16.
 */

public class Product {
    private String name;
    private int price;

    public Product(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws ExceptionEx{
        if(price<0){
            throw new ExceptionEx("Отрицательная цена");

        }
        this.price = price;
    }


}

