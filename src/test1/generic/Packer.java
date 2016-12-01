package test1.generic;

/**
 * Created by diana on 10.11.16.
 */

public final class Packer<T> {

    public Pack <T> Packaging(T element){ // универсальный упаковщик значений класса Pack
        return  new Pack<T>(element);
    }

    // универсальный  распоковщик получающий тип хранимого занчения
    public String unpackingValueType(Pack<?> pack){
        return pack.getObject().getClass().getName();
    }

    // универсальный распаковщик значений класса Pack

    public Object unpackig(Pack<?> pack){// когда незнаем како тип  лежит
        return pack.getObject();

    }
}
