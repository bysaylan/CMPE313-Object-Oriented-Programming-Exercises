package Book_Author;

public class Author {

    private int passYear;
    private int yearBorn;
    private String name;

    public Author(int yBorn, String n) {
        this.yearBorn = yBorn;
        this.name = n;
    }

    public void setPassYear (int year){
        this.passYear = year;
    }

    public String getName() {
        return name;
    }

    public int getAge (){
        return (this.passYear - this.yearBorn);
    }

}
