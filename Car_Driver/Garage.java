
package Car_Driver;

import javax.swing.JOptionPane;

public class Garage {
    public static void main(String[] args) {
     
        Driver driver= new Driver();
        Cars cars = new Cars();
       
        driver.setFullname ("J.R.R. Tolkien");
        driver.setBorn (1990);
        driver.setAge (31);
        driver.setLicenceType ("D");
        
        cars.setDriver ("J.R.R. Tolkien");
        cars.setModel ("Honda Civic Type R");
        cars.setHorsepower (1.6);
        cars.setType (false) ;
 
        JOptionPane.showMessageDialog(null, "Driver Name: " + driver.getFullname() + "\n Driver Born: "+ driver.getBorn()
         + "\n Driver Age: "+ driver.getAge()+ "\n Driver Licence: "+ driver.getLicenceType() 
                + "\n Car Model: "+ cars.getModel() + "\n Car Horse Power: "+ cars.getHorsepower() 
                + "\n Car Type: " + cars.getType());
        
        System.out.println("\n Driver Name: " + driver.getFullname() + "\n Driver Born: " + driver.getBorn() 
                + "\n Driver Age: " + driver.getAge()+ "\n Driver Licence: " + driver.getLicenceType() 
                + "\n Car Model: "+ cars.getModel() + "\n Car Horse Power: "+ cars.getHorsepower() );
    }
}
