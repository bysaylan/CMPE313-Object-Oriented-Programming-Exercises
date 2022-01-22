
public class XDuck extends XAnimal{
    
    public XDuck(int age, String type){
        super (age, type);
    }
    
    
    
    

    @Override
    public void makeSound() {
        System.out.println("This duck says wak wak");    
    }

    @Override
    public void Move() {
        System.out.println("This duck flys");    
    }
    
}
