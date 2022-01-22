
package Interface;

public class Cat extends Animal implements Mammal,Carnivor{


public Cat (int a, String b){
super(a,b);

}


@Override

    public boolean isWarmBlood(){
    System.out.println("Cats are Warm-Blooded");
    return true;
}

@Override
    public void eatMeat() {
        System.out.println("Cat is eat meat ");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps");
        }

    @Override
    public void run() {
        System.out.println("Cat walks and runs ");
    }
}

