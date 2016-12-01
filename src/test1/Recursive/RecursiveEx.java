package test1.Recursive;

/**
 * Created by diana on 10.11.16.
 */

public class RecursiveEx {

    public static void main(String[] args) {
        Recursive.numbers(10);
        System.out.println("Факториал 5   : " + Recursive.fact(5));
        System.out.println("3 в степени 8 : " + Recursive.pow(3, 8));
        System.out.println("Числа Фиббоначи: "
                + Recursive.fibo(15)
                + " Глубина рекурсии : " + Recursive.count);

    }
}
