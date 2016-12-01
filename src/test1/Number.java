package test1;


/**
 * Created by acer on 29.08.2016.
 */
public class Number {

    private int num;

    Number(int num) {
        this.num = num;
    }

    public int get() {
        return num;
    }

    public Number add(Number num) {
        return new Number(this.num + num.get());
    }

    public Number sub(Number num) {
        return new Number(this.num - num.get());

    }

    public Number mul(Number num)
    {
        return new Number(this.num * num.get());
    }

    public Number div(Number num) {

        return new  Number (this.num / num.get());
    }

    // public Number pow (Number exponent){
    //  Number exponent= 10;
    //return  (Number)Math.pow(get(),exponent);

    //  }
    public int fact(){
        int result= 1 ;
        for(int i=1;i<=num; i++ ) {
            result*=i;

        }
        return result;
    }
    public Number mod(Number num){
        return new Number (this.num % num.get());
    }
}





