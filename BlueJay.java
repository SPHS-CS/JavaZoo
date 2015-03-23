
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
        return "The blue jay whistles some random notes.";
    }
    
    @Override
    public String sleep()
    {
        return "zzzzzzzz";
    }
    
    @Override
    public String play()
    {
        double chance = Math.random();
        if(chance < .3)
        {
            return "The blue jay plays tag with his friends in the air.";
        }
        else if(chance < .4)
        {
            return "The blue jay is throwing a flat seed back and forth with his friends.";
        }
        else
        {
            return "The blue jay appears to be playing a game with his friends by throwing a berry through a hoop.";
        }
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
            return "The blue jay flies around and won't leave you alone.";
    }
}
