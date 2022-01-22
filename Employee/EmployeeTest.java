
package Employee;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class EmployeeTest {

    
    public static void main(String[] args) throws Exception {
                
        SimpleDateFormat  formatter = new SimpleDateFormat("dd/MM/yyyy");
                
        
        Employee Person1 = new Employee("John", "Male", "Engineer");
                
        Person1.setDOB(formatter.parse("12/12/1989"));
        Person1.setFullTimeSalary(2500);
        String res="Name: "+Person1.getName()+"\nPosition: "+Person1.getPosition()+"\nSex: "+Person1.getSex()+"\nSalary: "+Person1.getSalary()+"\nDob: "+Person1.getDate();
        
        JOptionPane.showMessageDialog(null,res);
        
        Employee Person2 = new Employee("Jane", "FeMale", "Consultant");
        Person2.setDOB(formatter.parse("24/03/1993"));
        Person2.setPartTimeHours(120);
        res="Name: "+Person2.getName()+"\nPosition: "+Person2.getPosition()+"\nSex: "+Person2.getSex()+"\nSalary: "+Person2.getSalary()+"\nDob: "+Person2.getDate();
        JOptionPane.showMessageDialog(null,res);
                
        }
}