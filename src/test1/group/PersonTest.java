package test1.group;

/**
 * Created by diana on 13.11.16.
 */

public class PersonTest {

    public static void main(String[] args) {
        Group group = new Group(10);
        Group newgroup = new Group(10);
        // создание обьекта внутреннего класса
        Group.InnerClass innerClass = group.innerReturn();


        // Создание обьектов класса Студент
        Student student2 = new   Student("Igor",     "Tetura",    22,     3);
        Student student3 = new  Student("Ivan",     "Ivanov",     22,      3);
        Student student4 = new  Student("Irina",    "Butskay",    23,      3);
        Student student5 = new  Student("Olga",     "Vadimova",   21,      3);
        Student student6 = new  Student("Vadim",    "Sopiga",     23,      3);
        Student student7 = new  Student("Slavic",   "Solovjov",   22,      3);
        Student student8 = new  Student("Svetlana", "Sergienko",  23,      3);
        Student student9 = new  Student("Igor",     "Vasunin",    22,      3);
        Student student10 = new  Student("Maksim",   "Dochuk",     21,      3);
        Student student11 = new Student("Vova",      "Malsev",    23,      3);
        Student student12 = new Student("Luda",      "Stupak",    21,      3);

        System.out.println("Добавление студента итеративно:" );

        innerClass.add();


        System.out.println(group);
        // System.out.println("Добавление остальных студентов в группу:");
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);
        group.addStudent(student10);
        // System.out.println( group.addStudent(student10));

        System.out.println("Добавление 11-го студента:");
        group.addStudent(student11);

        // Вывод группы

        System.out.println(group);

        System.out.println("Удаление студента из группы:"+  group.deleteStudent( student2));

        System.out.println(group);

        // Перевод студента в другую группу

        System.out.println("Перевод студента из группы:"+ "\n"+ group.remove(student5) );
        // проверить есть ли студент в группе
        System.out.println(group);


        System.out.println("Поместим студента в новую группу:" );
        newgroup.addStudent(student5);

        System.out.println("Студент в новой группе:");
        System.out.println(newgroup);



        System.out.println("Поиск студента по фамилии:");
        group.searchBySurname("Sopiga");

    }

}
