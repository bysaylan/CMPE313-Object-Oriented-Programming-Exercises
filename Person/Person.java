
package Person;

public class Person {

  
   private int age;
   private String name;
   private int currentYear=2021;
   
   Person(int a, String n){
          this.age = a;
          this.name = n;
   }
   
   Person(int a, String n, int cYear){
   
       this.age = a;
       this.name = n;
       this.currentYear = cYear;
   }
   
   public int getAge(){
   return this.age;
   }
   
   public String getName(){
   return this.name;
   }
   
   public int getYearBorn(){
   return (this.currentYear - this.age);
   }
   
   public void birthday(){
   this.age +=1;
   }
   
   
   
   
}