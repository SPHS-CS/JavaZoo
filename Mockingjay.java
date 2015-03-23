
/**
 * Write a description of class Mockingjay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mockingjay extends BlueJay
{
    public Mockingjay(String name, String description)
    {
        super(description, name);
    }
    
    @Override
    public String makeNoise()
    {
        return "The mockingjay whistles the mockingjay song and raises its wing.";
    }
    
    @Override
    public String eat()
    {
        if(Math.random() < .95)
        {
            return "The mockingjay eats some berries.";
        }
        else
        {
            return "The mockingjay eats the wrong berries and dies.";
        }
    }
}
