
package Dog;

public class Shelter {

   
    public static void main(String[] args) {
        
        Dog mike = new Dog (2,"husky");
        mike.setName("Mike the dog");
        
        Dog shelterDog = new Dog ("pitbull",5);
        shelterDog.setName("Bob");
        
        Dog [] dogArray = {mike,shelterDog};
        int counter=0;
        
        for (Dog eachDog : dogArray){

             counter+=1;
             
             System.out.println ("\n Dog " + counter + " info:"
                + "\n Name : " + eachDog.getName() + "\n Age : " 
                + eachDog.getAge()+ "\n Breed : " + eachDog.getBreed());
             
             eachDog.bark();
             
        }
        
      
        
    }
    
}
