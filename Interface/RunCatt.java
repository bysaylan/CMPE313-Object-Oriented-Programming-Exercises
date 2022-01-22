
package Interface;

import javax.swing.JOptionPane;

public class RunCatt {
    public static void main(String[] args) {
        
        
        Cat c=new Cat(5, "Miyav");
        
        c.eatMeat();
        c.setAge(5);
        c.isWarmBlood();
        c.sleep();
        c.run();
        c.setBreed("Mammal");
        
        JOptionPane.showMessageDialog(null, "Cat's Age is: "+ c.getAge() + "\nCat's Breed is: "
                + c.getBreed());
    }
}
