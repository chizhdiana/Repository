package test1.group;

/**
 * Created by diana on 13.11.16.
 */

public class Student extends Person {
    // private String group;
    private int course;

    public Student(){

    }

    public Student(String name, String surname, int age, int course) {
        super(name, surname, age);
        this.course = course;
    }


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString(){

        return
                "Имя:"            + super.getName()            +"\n"+
                        "Фамилия:"        + super.getSurname()         +"\n"+
                        "Возраст:"        + super.getAge()        + "\n"+
                        "Курс:"           + getCourse()           + "\n";

    }

}

