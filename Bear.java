import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Animal implements Roamable
{
    private List<String> toys;
    /**
     * Constructor for objects of class Bear
     */
    public Bear(String name, String description, String toy)
    {
        super(description, name);
        toys = new ArrayList<String>();
        toys.add(toy);
    }

    public Bear()
    {
        super("A general bear.", "General Bear");
        toys = new ArrayList<String>();
        toys.add("Beach Ball");
    }
    

    public String roam()
    {
        return "The bear roams about all bear-like.";
    }

    @Override
    public String makeNoise()
    {
        return "RAAAAAAAAAAWR";
    }
    
    @Override
    public String sleep()
    {
        return "zzzzzzzzz";
    }
    
    @Override
    public String play()
    {
        String playing = "";
        for(String toy : toys)
        {
            playing += "The bear plays with his "+ toy +".\n";
        }
        return playing;
    }
    
    @Override
    public String eat()
    {
        return "The bear reaches through the bars and eats a volunteer";
    }
    
    @Override
    public String move()
    {
        return "The bear backflips and strums his banjo.";
    }

    public List<String> getToys()
    {
        return toys;

    }
}
