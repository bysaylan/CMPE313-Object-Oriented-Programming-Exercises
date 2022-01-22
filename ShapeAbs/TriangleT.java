package ShapeAbs;


public class TriangleT extends Shapess{

    private int h;
    
    public TriangleT (int a, int b,int c, int h){
        super (a,b,c);
        this.h=h;
 
    }
  
    @Override
    public double calculateArea() {
       double area = (c * h)/2.0;
        return area;
      
    }

    @Override
    public double calculatePerimeter() {
       double perimeter = a+b+c;
        return perimeter;}
}
