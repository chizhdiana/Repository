package test1.practic;

/**
 * Created by diana on 10.11.16.
 */

public class Test {
    public static void main(String[] args) {
        Product product = new Product("Name");

        try {
            product.setPrice(-1000);
        } catch (ExceptionEx exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();


        }
    }
}


