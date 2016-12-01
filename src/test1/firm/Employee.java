package test1.firm;

/**
 * Created by diana on 13.11.16.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {
    private String name;
    private String surname;
    private int salary;
    private int account;
    private String gender;
    private String branch;
    //private Date d= new Date();
    //SimpleDateFormat str = new SimpleDateFormat("yy:MM:dd");
    //String date = str.format(d);  // дата отпуска
    private Calendar vacation;
    private Calendar month; // дата когда принят на работу


    public Employee(String name, String surname, int salary, int account, String gender, String branch, Calendar month,Calendar vacation) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.account = account;
        this.gender = gender;
        this.branch = branch;
        this.month = month;
        this.vacation = vacation;
    }

    public Employee() {
    }


    //public Date getD() {
       // return d;
   // }

   // public void setD(Date d) {
      //  this.d = d;
  //  }


    public Calendar getVacation() {
        return vacation;
    }

    public void setVacation(Calendar vacation) {
        this.vacation = vacation;
    }

    public Calendar getMonth() {
        return month;
    }

    public void setMonth(Calendar month) {
        this.month = month;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


@Override
    public String toString(){
        return "Имя                   "+"       "+ getName()+"\n"+
                "Фамилия              "+"       "+ getSurname()+"\n"+
                "Зарплата             "+"       "+ getSalary()+"\n"+
                "Счет                 "+"       "+ getAccount()+"\n"+
                "Пол                  "+"       "+ getGender()+"\n"+
                "Отделение            "+"       "+ getBranch()+"\n"+
                "Принят на работу     "+"      "+ getMonth()+"\n"+
                "Кол-во дней отпуска  "+"      "+ getVacation();

}
}