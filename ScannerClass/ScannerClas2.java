
package ScannerClass;

import java.util.Locale;
import java.util.Scanner;


public class ScannerClas2 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        
        System.out.println("M or F");
        char gender = sc.next().charAt(0);
        
        System.out.println("Enter Your CPGA");
        double cpga = sc.nextDouble();
        
        
        System.out.println("Enter Your Phone Number");
        long mobileNo = sc.nextLong();
        
        
        System.out.println("Your Name: " + name);
        System.out.println("Your Age is: " + age);
        System.out.println("You are a " + gender);
        System.out.println("Your CPGA: " + cpga);
        System.out.println("Your Phone Number: " + mobileNo);
        
    }
}
