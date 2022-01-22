
package Dog;

public class Dog {
   
    private int age;
    private String breed;
    private String name; //optional
    
    public Dog (int a, String b){
        this.age = a;
        this.breed = b;
    }
    
    public Dog (String breed, int age){
        this.age = age;
        this.breed = breed;
    }

    public Dog(String breed) {
        this.breed = breed;
    }
    
    public void setName (String n){
        this.name = n;
    }
    
    public String getName (){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }
    
    public void bark (){
        
        System.out.println ("\n Woof Woof");
    }
    
    
}
