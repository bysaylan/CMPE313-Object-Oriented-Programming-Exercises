package Person_Abstract;

import javax.swing.JOptionPane;


public class Test {
    
    public static void main(String[] args) {
        

        Employee e= new Employee ("Jack", 30, 70);
        e.setJobTitle("Computer Engineer");
        
        
        Student s= new Student("Suzan", 19, 20);
        s.setSchollName("CIU");
        
        
      JOptionPane.showMessageDialog(null,"Weekly Income of Employee: " + e.calculateWeeklyIncome() + "£"
                + "\nMonthly Income of Employee: " + e.MonthlyIncome() + "£"
                + "\n\nWeekly Income of Student: " + s.calculateWeeklyIncome() 
                + "\nMonthly Income of Student: " + s.MonthlyIncome() + "£"
                + "\nStudent Yearly Income: " +s.calculateBirthYear());
        
    }
}
