package test1;


/**
 * Created by acer on 31.08.2016.
 */
public class Calc {
    public int a;
    public int b;
    String op;
    int res = 0;
    public int result(int a, String op, int b){
        switch(op) {
            case "+":
                res = a + b;
                break;

            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
        }
        return res;
    }
}
