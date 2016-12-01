package test1;

/**
 * Created by diana on 09.11.16.
 */

public class NumberTest {
    public static void main(String... main){
        Number number1 = new Number(25);
        Number number2 = new Number(11);

        System.out.println("number1 = " + number1.get());
        System.out.println("number2 = " + number2.get());

        Number sum = number1.add(number2);

        System.out.println(sum.get());

        Number sub = number1.sub(number2);

        System.out.println(sub.get());

        Number mul = number1.mul(number2);

        System.out.println(mul.get());

        Number div= number1.div(number2);
        System.out.println(div.get());

        // Number fact = number1.fact;

        Number mod = number1.mod(number2);
        System.out.println(mod.get());




    }

}





