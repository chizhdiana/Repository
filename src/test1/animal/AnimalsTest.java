package test1.animal;

/**
 * Created by diana on 13.11.16.
 */

public class AnimalsTest {
    public static void main(String[] args) {


        Cat cat = new Cat("Животное","Mурка", "Mяу-мяу", "Еда", "Шерсть" );

        cat.selectType();

        cat.printName ();

        cat.say();

        cat.yellfNotGorged();

        cat.riseHair();

        cat.eat();


    }
}
