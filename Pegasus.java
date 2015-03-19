import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pegasus extends Animal implements Roamable, Flyable
{
    private String appearance;
    private List<String> toys;
    /**
     * Constructor for objects of class Bear
     */
    public Pegasus()
    {
        appearance = "This a magestic beast with the wings of a god and the silky hair of Rumpelstiltskin's yarn. Use your imagination.";
        
    }

    @Override
    public String makeNoise()
    {
        return "neigh";
    }
   
    
    @Override
    public String play()
    {
        
        return "the pegasus play tag with each other";
    }
    
    @Override
    public String eat()
    {
        return "The pegasus eats some magical hay";
    }
    
    @Override
    public String move()
    {
        return "the pegasus flys";
    }
     @Override
    public String fly()
    {
        return "the pegasus spreads it's majestic wings and soars to the heavens";
    }
    @Override
    public String roam()
    {
        return "the pegasus gallops the prary";
    }
}
