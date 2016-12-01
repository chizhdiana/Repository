package test1.firm;

import java.util.GregorianCalendar;

/**
 * Created by diana on 13.11.16.
 */

public class FirmTest {
    public static void main(String[] args) {

      Firm firm = new Firm("Soft", "Kiev",200000,4);




        // Создали сотруднтков фирмы
        Employee employee =  new Employee("Ivan", "Petrov",      10000, 0,  "mail",   "Fin",         new GregorianCalendar(11,11,2016), new GregorianCalendar(01,07,2016));
        Employee employee1 = new Employee("Olga", "Lugina",      15000, 0,  "female",  "Sale",       new GregorianCalendar(11,11,2016), new GregorianCalendar(01,06,2016));
        Employee employee2 = new Employee("Timur", "Karaiev",    20000, 0,   "mail",   "Marketing",  new GregorianCalendar(11,11,2016), new GregorianCalendar(01,05,2016));
        Employee employee3 = new Employee("Taras", "Venglevsky", 10000, 0,  "mail",    "Logistic",   new GregorianCalendar(11,11,2016), new GregorianCalendar(01,07,2016));

        firm.addEmployee(employee);
        firm.addEmployee(employee1);
        firm.addEmployee(employee2);
        firm.addEmployee(employee3);




       firm.SortBySallary();

        System.out.println(firm);

       firm.getSalaryForAll();


    }



}
