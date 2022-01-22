package ShapeAbs;


public class CircleC extends Shapess {


    private final double PI = 3.14;
    
    
    public CircleC(int r){
          super(r);
    }

    
    @Override
    public double calculateArea() {
    double area = PI*r*r;
    return area;
    }

    @Override
    public double calculatePerimeter() {
    double perimeter= 2*PI*r;
    return perimeter;
}
}
