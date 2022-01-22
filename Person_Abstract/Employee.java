package Person_Abstract;



public class Employee extends Person {
    
private String jobTitle;
    

public Employee (String name, long salary, int a){
    
    super(name, salary, a);
    
}

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public double calculateWeeklyIncome() {
     return salary * 7;  
     
    }

    @Override
    public double MonthlyIncome() {
    return salary * 30;
    
    }
   
}