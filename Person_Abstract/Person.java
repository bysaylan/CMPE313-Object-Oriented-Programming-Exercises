package Person_Abstract;


import java.util.Calendar;


public abstract class Person {

    protected String FullName;
    protected int age;
    protected long allowance;
    protected long salary;
    protected int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);

public Person(){

}

public Person (String fName, int a, long allowance){

    this.FullName=fName;
    this.age=a;
    this.allowance=allowance;
}

public Person (String FName, long salary, int a){
    this.FullName=FName;
    this.age=a;
    this.salary=salary;
}

public abstract double calculateWeeklyIncome();    
   

public abstract double MonthlyIncome();
}



