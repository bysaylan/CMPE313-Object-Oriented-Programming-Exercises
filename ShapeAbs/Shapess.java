package ShapeAbs;


public abstract class Shapess {

    protected int a,b,c,r;
    protected String name;

    
    Shapess(int r){
        this.r=r;  
}
    Shapess(int a, int b){
         this.a= a;
         this.b= b;
    
}
    Shapess(int a, int b,int c){
         this.a=a;
         this.b=b;
         this.c=c;
}
     
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public double calculateArea(){
        return 0;
    } 
    public double calculatePerimeter(){
        return 0;
    }

}
