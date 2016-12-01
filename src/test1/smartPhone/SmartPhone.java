package test1.smartPhone;

import test1.phone.Phone;

/**
 * Created by diana on 13.11.16.
 */

public class SmartPhone extends Phone {
    public String os;

 public  SmartPhone(String model, String os){
 super(model);
 this.os = os;
}
}