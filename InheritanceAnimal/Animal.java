
    public abstract class Animal {

    protected int age;
    protected boolean isDomestic=false;
    protected String breed;

    public Animal(){
    }

    public Animal(int a,boolean isD){

        this.age=a;
        this.isDomestic=isD;
    }


    public void setDomestic(boolean d) {
        isDomestic = d;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(String b) {
        this.breed = b;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public String getBreed() {
        return breed;
    }

    public abstract void move();
    }
    

