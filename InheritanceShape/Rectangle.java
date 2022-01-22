
public class Rectangle extends Shapes {

    public Rectangle(int a, int b){
        super(a,b);
    }

    
    @Override
    public double calculateArea() {
    area = a*b;
    return area;
    
    }

    @Override
    public double calculatePerimeter() {
     peremiter = 2* (a+b);
     return peremiter;

    }
    
}
