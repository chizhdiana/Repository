package test1.generic;

/**
 * Created by diana on 10.11.16.
 */

public class Pack <T>{
    private T object;

    public Pack(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
    public void valueType(){
        System.out.println("Тип знач в контейнере"+ object.getClass().getName());
    }
}
