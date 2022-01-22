
package Interface2;

import javax.swing.*;

public class ShelterRun {
    public static void main(String[] args) {
/*
    Owner o =new Owner("Jack Black");
    Dog d = new Dog ("Golden Retriever", 5 );
    
    o.setName("Jack Black");
    d.adoptionCompleted();
    d.eat("Dog Biscuite");
    d.sleep(7);
    d.birthDay();
    d.move("home","park");
    d.setName("Max");
    d.setOwner(o);


    
   String output = "";
    
    output+="\nDog name" +d.getName();
    output+="\nDog Breed" +d.getBreed();
    output+="\nDog Age" +d.getAge();;
    output+="\nDog's Owner" + d.getOwnerName();
    */




        String output="";
        Owner Jack= new Owner("Jack Black");
        Dog max= new Dog("Golden Retriever",5);
        max.setName("Max");
        max.setOwner(Jack);
        max.adoptionCompleted();
        max.eat("Dog biscuites");
        max.sleep(7);

        max.birthDay();
        max.move("home","park");


    output+="\n Dog name is: "+max.getName();
        output+="\n Dog Breed is: "+max.getBreed();
        output+="\n Dog age is: "+max.getAge();
        output+="\n Dog Owner is: "+max.getOwnerName();
        JOptionPane.showMessageDialog(null,output);

    
}
}