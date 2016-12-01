package test1.animal;

/**
 * Created by diana on 13.11.16.
 */

public class Cat extends Animal {
    private Boolean hungry =  false;

    public Cat(String type,String name, String voice, String meal, String hair ){
        super(type, name , voice, meal, hair);

    }

    @Override
    public void printName()
    {   super.setName("Мурка");
        getName();
        System.out.println("Имя:" + " " + getName());
    }
    @Override
    public void selectType(){
        super.setType("Кошка");

        System.out.println(getType());
    }

    @Override
    public void say()
    { setVoice("Мяу-мяу");
        getVoice();
        System.out.println("Голос:" + " " + getVoice());
    }

    public void yellfNotGorged() {
        if (!hungry ) {
            hungry = true;

            System.out.println("Кошка голодная:" + " " + "yellfNotGorged");

        }
    }
    @Override
    public void riseHair(){
        setHair("Up");
        getHair() ;
        System.out.println("У кошки шерсть дыбом:" + " "+ getHair());
    }
    @Override
    public void eat(){
        if(getMeal()!= null)
            System.out.println("Кошка поела");
    }
}
