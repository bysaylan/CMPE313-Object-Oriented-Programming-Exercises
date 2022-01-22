package ShapeAbs;


import javax.swing.JOptionPane;


public class RunShapess {
    
    public static void main(String[] args) {
        
        CircleC ci = new CircleC (8);
        TriangleT tr = new TriangleT (8,6,4,2);
        RectangleR rt = new RectangleR (2,4);
        
        ci.setName("Circle");
        rt.setName("Rectangle");
        tr.setName("Triangle");
     
        Shapess [] shapesArray = {ci, tr, rt};

        for(Shapess eachShape: shapesArray) {
            
        System.out.println("Shape Name: " + eachShape.getName()
        +"\nShape Area: " + eachShape.calculateArea()+ 
        "\nShape Perimeter: " + eachShape.calculatePerimeter());
       
        
         JOptionPane.showMessageDialog(null, "Shape Name: " + eachShape.getName()
        +"\nShape Area: " + eachShape.calculateArea()+
        "\nShape Perimeter: " + eachShape.calculatePerimeter());
       
    }
    }
}
   /*
        
        Object shapes [] = {ci, tr, rt};

        String output="";
        
        for (Object eachShape : shapes){
        
            if (eachShape instanceof CircleC){
           
            output +=  "\n CircleC area = " + ci.calculateArea();
            output +=  "\n CircleC perimeter = " + ci.calculatePerimeter();
            }
            
            if (eachShape instanceof RectangleR){
           
            output +=  "\nRectangle Area = " + rt.calculateArea();
            output +=  "\nRectangle Perimeter = " + rt.calculatePerimeter();
            }
            
             if (eachShape instanceof TriangleT){
           
            output +=  "\nRectangle Area = " + tr.calculateArea();
            output +=  "\nRectangle Perimeter = " + tr.calculatePerimeter();
            }
        }//for each
        
        JOptionPane.showMessageDialog(null, "Shape Name: " + eachShape.getName()
        +"\nShape Area: " + eachShape.calculateArea()+
        "\nShape Perimeter: " + eachShape.calculatePerimeter());
    }
}*/