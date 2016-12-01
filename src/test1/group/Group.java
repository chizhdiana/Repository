package test1.group;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by diana on 13.11.16.
 */




public class Group extends Student implements StudentGroupInterface {

    class InnerClass {
        Scanner scn = new Scanner(System.in);
        // Добавление студента итерактивно
        public void add() {
            for (int i = 0; i < group.length; i++) {

                if (group[i] ==null) {
                    //group[i] = new Student();
                    addStudent( new Student());
                    System.out.println("Введите имя:");
                    try {
                        group[i].setName(scn.nextLine());

                    } catch (InputMismatchException e) {
                        System.out.println("Пожалуйста введите корректные данные");
                    }
                    System.out.println("Введите фамилию:");
                    try {
                        group[i].setSurname(scn.nextLine());

                        if(scn.nextLine()== null)throw new Exception ();

                    } catch (Exception e) {
                        System.out.println("Пожалуйста введите корректные данные");
                    }
                    System.out.println("Введите возраст:");
                    try {
                        group[i].setAge(scn.nextInt());

                    } catch (InputMismatchException e) {
                        System.out.println("Пожалуйста введите числовое значение");
                    }
                    System.out.println("Введите курс:");
                    try {
                        group[i].setCourse(scn.nextInt());

                    } catch (InputMismatchException  ex) {
                        System.out.println("Пожалуйста введите числовое значение");
                    }
                    break;

                }

            }
        }

    }

    private Student student;
    private Student[]group;
    private Student[]newgroup;
    private String group_name;
    private int elem;
    private int size;

    public Group(  int size){
        group_name = group_name;
        group= new Student[size];
        newgroup= new Student[size];
        elem=0;
        size=0;
    }

    public Group(String name, String surname, int age, int course ) {
        super(name, surname, age, course);
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    // Добавление студента в группу
    @Override
    public void addStudent(Student student) {
        // { if (size < group.length)
        try{

            group[size++]=student;
            if(size>10){throw new ExeptionEx( " В группе больше нет мест");
            }
        }  catch (ExeptionEx e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException r){
            System.out.println("В группу можно добавить не больше 10 студентов");
            //}

        }

    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0; i<group.length; i++){
            if(i<size) {
                builder.append(group[i]+"\n" );

            }
        }
        builder.append("]");
        return builder.toString();

    }
    // Удаление студента из группы
    @Override
    public boolean deleteStudent(Student student) {
        for(int i=0; i<group.length; i++) {
            if (group[i]== student) {
                group[i] = null;
                size--;
                return true;
            }
        }
        return false;
    }
    // Поиск студента по фамилии

    public void searchBySurname(String surname) {
        String temp = "";
        for (int i = 0; i < group.length; i++) {
            try {
                temp = group[i].getSurname();
                if (temp == surname) {
                    System.out.println(group[i].toString());
                    return;
                }
            } catch (NullPointerException e) {

            }

        }
        System.out.println("Student " + surname + " not found!!!");
    }



    public void addStudentIter(){
        InnerClass innerClass = new InnerClass();
        // innerClass.add();
    }

    public InnerClass innerReturn(){
        return new InnerClass();
    }

    // Перевод студента в другую группу
    public Student remove(Student student){
        for(int i=0; i<group.length; i++){
            if(group[i]==student){
                student=null;
                size--;}

            if(newgroup[i]==null){
                newgroup[i]=student;
                size++;
            }
        }
        return student;
    }

}
