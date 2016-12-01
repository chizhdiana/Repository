package test1.generic;

/**
 * Created by diana on 10.11.16.
 */

public class GenericTest {
    public static void main(String[] args) {
        Pack<Integer>number = new Pack<>(1000);
        Pack<String> string= new Pack<>("Hello");
        System.out.println("Значение number"+ number.getObject());
        number.valueType();
        System.out.println("Значение строка"+ string.getObject());
        string.valueType();


        Pack object = new Pack(150.25F);// обернулся в обьект Float, если F убрать будет Double
        System.out.println("Значение object"+ object.getObject());
        object.valueType(); // присвоился тип который мы присвоили в скобкахб без определения типа
        // в этом сдлучае нужно делать проверку по определению значения

        Packer packer =new Packer();
        System.out.println(packer.unpackingValueType(number)); // выведем тип значения
        Integer num= (Integer)packer.unpackig(number);
        System.out.println("Значение num"+ num);

        System.out.println(packer.unpackingValueType(string));
        String str= (String)packer.unpackig(string);
        System.out.println("Значение num"+ str);

        System.out.println(packer.unpackingValueType(object));
        Double dbl= (Double)packer.unpackig(object);
        System.out.println("Значение num"+ dbl);

        UniquePack<Integer, String> uniquePack = new UniquePack(100, "Hello");
        System.out.println(uniquePack.getKey());
        System.out.println(uniquePack.getValue());

    }
}
