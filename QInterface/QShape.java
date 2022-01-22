
package QInterface;

public abstract class QShape {
    protected int r;
    protected int a;
    protected int b;
    
    public QShape(){
    }
    public QShape(int r){
        this.r=r;
    }
    public QShape(int a, int b){
        this.a=a;
        this.b=b;
    }
    public abstract double CalculateArea();
    public abstract double CalculatePeremiter();
}
