
package ScannerClass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Yaur Age");
        int Age = sc.nextInt();
        System.out.println("Male or Female ?, Please Enter a charecter");
        char gender = sc.next().charAt(0);
        
        System.out.println("Your Name is " + name );
        System.out.println("Your Age is " + Age);
        System.out.println("You are a " + gender);
        
        
        
        
    }
    }

