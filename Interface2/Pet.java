
package Interface2;

public abstract class Pet{
    
    protected int age;
    protected String breed;
    protected Owner owner;

    
    public Pet(String breed, int age){
        this.age=age;
        this.breed=breed;

    }
    
    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

   
    public String getOwnerName() {
        return owner.getName();
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    public void birthDay(){
     this.age +=1;   
    }
     public abstract void adoptionCompleted();
}
