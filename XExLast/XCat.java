

public class XCat extends XAnimal {
    private String name;
    
    
    public XCat(int age, String type){
        super (age, type);
    }
    
    public XCat (String type, boolean isMaaml){
        this.type=type;
        this.isMaaml=isMaaml;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
  
    @Override
     
   public void makeSound(){
       System.out.println("This Cat is Maaww");
   }
   
   public void Move(){
       System.out.println("This cat walks");
   }
}
