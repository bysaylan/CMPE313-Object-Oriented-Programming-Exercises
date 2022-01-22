
package QInterface;

public class QRun {
    public static void main (String[] args){
        
        
       QCircle c = new QCircle (5);
      
       
       
        System.out.println("Circle Area is " + c.CalculateArea() 
          + "\nCircle Perimeter is " + c.CalculatePeremiter() );
    }
}
