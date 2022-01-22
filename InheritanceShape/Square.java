
public class Square extends Shapes {

    public Square (int a){
        super(a);
        
    }

    
    @Override
    public double calculateArea() {
    area = a*a;
    return area;
    
    }

    @Override
    public double calculatePerimeter() {
     peremiter = 4*a;
     return peremiter;
    }
    
}
