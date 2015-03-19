
/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Animal implements Swimmable
{
    
    /**
     * Constructor for objects of class Shark
     */
    public Shark(String name, String description)
    {
        super(name, description);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public String move()
    {
        return "The shark circles in the water.";
    }
    
    @Override
    public String makeNoise()
    {
        return "The shark swishes quietly in the water.";
    }
    
    @Override
    public String eat()
    {
        return "The shark jumps out of the water and eats a bird.";
    }

    @Override
    public String play()
    {
        return "Sharks don't play.";
    }
    
    public String swim()
    {
        return "The shark swims.";
    }
}
