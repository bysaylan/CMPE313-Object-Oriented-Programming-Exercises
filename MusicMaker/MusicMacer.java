
public abstract class MusicMacer {
    protected String name;
    protected String instrument;
    
    public MusicMacer(){
    }
    public MusicMacer(String instrument, String name){
        this.name=name;
        this.instrument=instrument;
    }
    
    public void setInstrument(String instrument){
        this.instrument=instrument;
    }
    public String getInstrument(){
        return instrument;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void play();
}
