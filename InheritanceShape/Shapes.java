

public abstract class Shapes {
    
    protected int a,b,c;
    protected double area=0, peremiter=0;
    protected String name;
    
   
    public Shapes(int r){
        this.a=r;

 
    }
    public Shapes (int a, int b){
        this.a=a;
        this.b=b;
    }
    
    public Shapes (int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}

