
/**
 * Write a description of class BlueJay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueJay extends Animal implements Flyable
{
    public BlueJay(String name, String description)
    {
        super(description, name);
    }
    
    public BlueJay()
    {
        super("A bright blue jay that has a lot of energy.", "BJ");
    }
    
    @Override
    public String makeNoise()
    {
        return "The blue jay whistles the mockingjay song.";
    }
    
    @Override
    public String sleep()
    {
        return "zzzzzzzz";
    }
    
    @Override
    public String play()
    {
        return "The blue jay flies loops through the air.";
    }
    
    @Override
    public String eat()
    {
        return "The blue jay swoops down and eats some seeds.";
    }
    
    @Override
    public String move()
    {
        return fly();
    }
    
    @Override
    public String fly()
    {
            return "The blue jay flies around.";
    }
}
