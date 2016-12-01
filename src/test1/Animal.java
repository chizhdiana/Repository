package test1;

/**
 * Created by diana on 09.11.16.
 */

public class Animal {
    private String type;
    private String name;
    private String voice;
    private String hair;
    private String meal;
    private int year;
    private String move;
    private int weight;
    private int height;


    public Animal( String type, String name, String voice, String hair, String meal) {
        this.type= type;
        this.name = name;
        this.voice = voice;
        this.hair = hair;
        this.meal = meal;
    }
    public Animal(String type) {
        this.type = type;
    }
    public Animal(String name, String voice, String hair, String meal, int year, String move, int weight , int height ){
        this.name = name;
        this.voice = voice;
        this.hair = hair;
        this.meal = meal;
        this.year =  year;
        this.year =  year;
        this.move = move;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getHair() {
        return hair;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getMeal() {
        return meal;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMoove(String moove) {
        this.move = move;
    }

    public String getMoove() {
        return move;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void selectType(){
        setType(this.type = type);
        System.out.println("Тип животного:"+ " "+ type);

    }
    public void printName(){
        setName(this.name = name);
        System.out.println("Имя животного:"+ " "+ name);

    }
    public void say(){
        setVoice(this.voice = voice);
        System.out.println(voice);
    }

    public void riseHair(){

    }

    public void eat(){
        System.out.println(" ");
    }




}

