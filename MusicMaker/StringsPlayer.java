
public class StringsPlayer extends MusicMacer {
    
    public StringsPlayer(){
    }
    public StringsPlayer(String type, String name){
        super (type, name);
    }
    
    @Override
    public void play(){
        System.out.println("ding ding");
    }
}
