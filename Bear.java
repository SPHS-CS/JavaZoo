import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear
{
    private String appearance;
    private List<String> toys;
    /**
     * Constructor for objects of class Bear
     */
    public Bear()
    {
        appearance = "This a standard looking bear in all respects. Use your imagination.";
        toys = new ArrayList<String>();
        toys.add("Plush Fish");
    }

    public String roar()
    {
        return "RAAAAAAAAAAWR";
    }
    
    public String sleep()
    {
        return "zzzzzzzzz";
    }
    
    public String play()
    {
        String playing = "";
        for(String toy : toys)
        {
            playing += "The bear plays with his "+ toy +".\n";
        }
        return playing;
    }
    
    public String eat()
    {
        return "The bear reaches through the bars and eats a volunteer";
    }
    
   
    
    
    
    
    
}
