
package Interface;

public abstract class Animal {
    private int age;
    private String breed;

   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getBreed() {
        return breed;
    }

    
    public void setBreed(String breed) {
        this.breed = breed;
    }
   
    Animal (int age, String breed){
    this.age=age;

}

    public abstract void sleep();
    public abstract void run();

}