
package Interface2;

public class Dog extends Pet implements Domestic{
    
   
    private String name;
    
    public Dog (String breed, int age){
     super(breed,age);
     
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void adoptionCompleted() {
        System.out.println(this.name+" is adapted by "+getOwnerName());
    }
    
    @Override
    public void move(String from, String to) {
        System.out.println(this.name +" run from "+from+" to "+to);
         }

    @Override
    public void eat(String food) {
        System.out.println(this.name+" eats "+food);
    
    }

    @Override
    public void sleep(int hours) {
        System.out.println(this.name+" sleep for "+ hours +" hours ");
       
    }
    
}
