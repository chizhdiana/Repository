package test1;


/**
 * Created by acer on 12.09.2016.
 */
public class ProductTest {
    public static void main(String[] args) {


        Product product = new Product("Продукты");
        Fish fish = new Fish("Продукт", 70, 11122233);

        fish.printPrice();
        fish.printStoragePeriod();
        fish.printBarAndPrice();
        fish.cannibalism();
    }
}