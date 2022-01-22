package ShapeAbs;



public class RectangleR extends Shapess {
    
    
    public RectangleR(int a, int b){
        super(a, b);
    }

    @Override
    public double calculateArea() {
      double area= b * b;
      return area;
    }
    
    @Override
    public double calculatePerimeter() {
     double perimeter = 2* (a+b);
     return perimeter;
    }
}
