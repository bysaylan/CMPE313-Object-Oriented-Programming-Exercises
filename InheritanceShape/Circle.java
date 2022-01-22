
public class Circle extends Shapes {

    private final double PI = 3.14;
    
    public Circle(int r){
    super(r);
    }
    
    @Override
    public double calculateArea() {
    area = PI * a *a;
    return area;
    }

    @Override
    public double calculatePerimeter() {
        peremiter = 2 * PI * a;
        return peremiter;
    }
    }

