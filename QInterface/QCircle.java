
package QInterface;

public class QCircle extends QShape implements TDS{
    private final double PI = 3.14;
    
    public QCircle (int r){
        super (r);
    }


    @Override
    public double CalculateArea() {
    double area = PI * r *r;
    return area;
    }
    @Override
    public double CalculatePeremiter() {
      double peremiter = 2 * PI * r;
        return peremiter;
    }
    }