package test1.Recursive;

/**
 * Created by diana on 10.11.16.
 */


public final class Recursive {

    static int count = 0;

    //Чилса от 0 до NUM
    public static void numbers(int number) {
        //Терминальная ветвь - в ней
        //предусматривается условие выхода
        //из рекурсивного алгоритма
        if (number == 0) {
            System.out.println(number);
            return;
            //Рекурсивная ветвь - вней происходит
            //рекурсивный вызов
        } else {
            System.out.print(number + " ");
            numbers(--number);
        }
    }

    public static int fact(int number) {
        if (number == 1) {
            return 1;
        } else { return number * fact(number - 1);
            //int tmp = number;
            //int res = fact(--tmp);
            //return number * res;
        }
    }

    public static int pow(int number, int pow) {
        if (pow == 1) {
            return number;
        } else if (pow == 0) {
            return 1;
        } else {
            return number * pow(number, pow-1);
        }
    }

    public static String fibo(int number) {
        return (number == 1 | number == 2)
                ? "1" : fibo(--number) + " " + getFibo(number);
    }

    public static int getFibo(int num) {
        count++;
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return getFibo(num - 1) + getFibo(num - 2);
        }
    }
    static int fibonachi(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else{
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
}
