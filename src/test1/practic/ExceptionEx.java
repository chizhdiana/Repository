package test1.practic;

/**
 * Created by diana on 10.11.16.
 */

public class ExceptionEx extends Exception{
    public ExceptionEx(String message){// конструктор позволяет добавить сообщение в класс исключение
        super(message);
    }
    // подавление исключения
    // public ExceptionEx(Throwable exc){
    // super(exc);
    // }
    //
    // public ExceptionEx(String message, Throwable exc ){
    // super(message, exc);
    // }
}

