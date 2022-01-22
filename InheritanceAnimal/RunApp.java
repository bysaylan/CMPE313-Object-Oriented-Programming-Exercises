

public class RunApp {

    public static void main (String [] args){



        Dog bobby = new Dog(5,true);
        bobby.setName("Bobby");
        bobby.setBreed("Husky");
        bobby.birthday();
        System.out.println(bobby.getName()+" is "+bobby.getAge()+" Years Old");

        Bird bird= new Bird();
        bird.setBreed("Robi");
        bird.setAge(2);
        bird.setDomestic(false);

    Animal[] myAnimals={bobby,bird};
    for (Animal eachAnimal:myAnimals){
        eachAnimal.move();
    }
    }
}
