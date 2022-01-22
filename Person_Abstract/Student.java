package Person_Abstract;

public class Student extends Person {
    private String schollName;
    
    public Student(String name, int a, long allowance){
        super(name, a, allowance);
    }
    
    public void setSchollName(String name){
        this.schollName=name;
    }
    
    public String getSchollName(){
        return schollName;
    }
    
    public int calculateBirthYear(){
        return CurrentYear - age;
    }
    
    
    @Override
    public double calculateWeeklyIncome() {
     return allowance * 30;  
     
    }

    @Override
    public double MonthlyIncome() {
    return allowance * 7;
    
    }
 
   
}
