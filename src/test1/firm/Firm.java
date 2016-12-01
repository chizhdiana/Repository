package test1.firm;

/**
 * Created by diana on 13.11.16.
 */

import java.util.Arrays;

import java.util.Calendar;
import java.util.EmptyStackException;
import java.util.GregorianCalendar;

public class Firm  extends Employee{

    private String firm_name;
    private String firm_adress;
    private int firm_account;
    private Employee employee;
    private Employee[] firm ;
    private int size;

    public Firm(String name, String surname, int salary, int account, String gender, String branch, Calendar month, Calendar vacation) {
        super(name, surname, salary, account, gender, branch, month, vacation);
    }

    public Firm( String firm_name, String firm_adress, int firm_account, int size ){

        firm_name = " Soft";
        firm_adress = "Kiev";
        this.firm_account= 200000;
        firm = new Employee[size];
        size = 4;
    }


    public int getFirm_account() {
        return firm_account;
    }

    public void setFirm_account(int firm_account) {
        this.firm_account = firm_account;
    }

    public void addEmployee(Employee employee) {
        if (size < firm.length) {
            firm[size++] = employee;

        }

    }

   public void SortBySallary(){
        System.out.println("Сотрудники отсортированные по зп:");
        int left = 0;
        int right = firm.length-1;
         Employee tmp ;
       do {
            for (int size= left; size < right; size++) {
                if (firm[size].getSalary() > firm[size+ 1].getSalary()) {
                    tmp = firm[size];
                    firm[size] = firm[size + 1];
                    firm[size + 1] = tmp;
                }
            }

            right--;

            for (int j = right; j > left; j--) {
                if (firm[j].getSalary() < firm[j - 1].getSalary()) {
                    tmp = firm[j];
                    firm[j] = firm[j - 1];
                    firm[j - 1] =  tmp;
                }
            }
            left++;
        }

        while (left <= right);
    }

    public void getSalaryForAll() {
        System.out.println("Сумма на счету после выдачи зп:");

        for (int i = 0; i < firm.length; i++) {
            if( firm[i].getSalary()>0 ){
                firm[i].setAccount(firm[i].getAccount() + firm[i].getSalary());
                firm_account = firm_account - firm[i].getSalary();
                //firm_account--;
            }
            System.out.println("Сума зарплаты:"+ firm[i].getSalary());
            System.out.println("Сумма на счету:"+ firm[i].getAccount());
            System.out.println( "Счет фирмы после выдачи зп:"+    firm_account);
        }
    }

    public  void calcVacations() {

        Calendar currentCalendar = Calendar.getInstance(); // сегоднешняя дата
        for (Employee empVac:firm){
            long diff = currentCalendar.getTimeInMillis()- getMonth().getTimeInMillis();
            long seconds = diff / 1000;
             // в минутах
            long minutes = seconds / 60;
            // в часах
            long hours = minutes / 60;
             // в днях
            long days = hours / 24;

            if(days>=182){
                getVacation().add(Calendar.DAY_OF_MONTH, 2);

                System.out.println("Колличество дней отпуска"+ getName()+ " "+ getVacation());
            }
            else{
                System.out.println("Колличество дней отпуска"+ getName()+ " "+ getVacation());

            }

        }


    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0; i<firm.length; i++){
            if(i<size){

                builder.append(firm[i]+"\n");
            }

            }
            builder.append("]");
            return builder.toString();

        }
    }








