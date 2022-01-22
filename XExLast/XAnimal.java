
public abstract class XAnimal {
    protected int age;
    protected String type;
    protected boolean isMaaml;

public XAnimal(){
    
}
    public XAnimal(int age, String type){
        this.age=age;
        this.type=type;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String t){
        this.type = t;
    }
    public String getType(){
        return type;
    }
    public boolean setIsMaaml(boolean value){
        this.isMaaml=false;
        return false;

    }
    public boolean getIsMaamll(){
        return isMaaml;
    }
    
   
    public abstract void makeSound();
    public abstract void Move();
    
}



