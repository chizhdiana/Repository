package test1.group;

/**
 * Created by diana on 13.11.16.
 */

public   class Person implements PersonInterface {
    private String name;
    private String surname;
    private String gender;
    private double weight;
    private double height;
    private int age;
    private String education;
    private String profession;
    private String hobby;


    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        //this.education = education;
    }

    public Person(String name, String surname, String gender, double weight, double height, int age, String education, String profession, String hobby) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.education = education;
        this.profession = profession;
        this.hobby = hobby;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }



   /* public String toString(){
        return
                "Имя:"            + getName()       +"\n"+
                        "Фамилия:"         + surname    +"\n"+
                        "Вес:"            + weight     +"\n"+
                        "Рост:"           + height     +"\n"+
                        "Пол:"            + gender     + "\n"+
                        "Возраст:"        + age        + "\n"+
                        "Образование:"    + education  +"\n"+
                        "Профессия:"      + profession +"\n"+
                        "Хобби:"          + hobby      +"\n";
    } */

}
