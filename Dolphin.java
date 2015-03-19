
/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Animal implements Swimmable
{
    // instance variables - replace the example below with your own
    private String description;
    private boolean hasBeachBall;
    private String name;

    /**
     * Constructor for objects of class Dolphin
     */
    public Dolphin()
    {
        name = "DolphinRashandala";
        hasBeachBall = true;
        description = "This is a pink amazon dolphin.  Much cool.";

    }
    
    public String swim()
    {
        return "The dolphin swims about completely unaware that it is in a zoo.";

    }

    @Override
    public String move()
    {
        return "The dolphin swims about all dolphin-like.";
    }
    
    @Override
    public String play()
    {
        if(hasBeachBall)
            return "The dolphin plays with the beachball and is having a splendid day.";
        return "The dolphin is depressed at his severe lack of beachball.  He shoots lasers.";
    }
    
    @Override
    public String makeNoise()
    {
        return "EEEEeeeeEEEEeeeeEEEEeeeeEEEEeeeeEEEEeeeeEEEEeeee";
    }
    
    @Override
    public String eat()
    {
        return "The dolphin leaps out of the water and eats a bird.";
    }
    
    @Override
    public String sleep()
    {
        return "The dolphin doesn't sleep because it's afraid to drown.";
    }
}
