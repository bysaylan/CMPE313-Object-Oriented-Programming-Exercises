
package Basic_Java;


import java.util.Scanner;



public class ScannerExample {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       String name;
       int yearBorn=0,age;
       int currentYear = 2021;
       String yearBornStr;
      
       System.out.print("Lütfen isminizi girin:");
       name = sc.nextLine();
       System.out.print("Hangi Yılda Doğdun?:");
       yearBornStr = sc.nextLine();
       
      try{
       yearBorn = Integer.parseInt(yearBornStr);
               age = currentYear - yearBorn;

          System.out.println("Adın:" + name);
          System.out.println("Yaşın:" + age);
       }
       catch(Exception err){
           System.out.println("Lütfen bir Numara giriniz" 
           + "Error: Bir Yıl numarası gibi" + err);
       
       
    }
    
}
}
