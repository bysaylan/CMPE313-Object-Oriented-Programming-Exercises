
public class MainShape {
    
public static void main(String[] args) {

            Square mySquare = new Square (5);
            Rectangle myRectangle = new Rectangle (2,4);
            Circle MyCircle = new Circle (5);

            mySquare.setName("Square");
            myRectangle.setName("Rectangle");
            MyCircle.setName("Circle");

            
            Shapes [] shapesArray = {mySquare, myRectangle, MyCircle};


            for(Shapes eachShape: shapesArray) {

                System.out.println("Shape Name: " + eachShape.getName());
                System.out.println("Shape Area: " + eachShape.calculateArea());
                System.out.println("Shape Perimeter: " + eachShape.calculatePerimeter());

        }
        } 
}
