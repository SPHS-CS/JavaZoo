
/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Animal
{
    // instance variables - replace the example below with your own 
    private boolean hasBeachBall;

    /**
     * Constructor for objects of class Dolphin
     */
    public Dolphin(String description, String name, boolean hasBall)
    {
        super(description, name);
        hasBeachBall = hasBall;
    }

    public String move()
    {
        return "The dolphin swims about all dolphin-like.";
    }
    
    public String play()
    {
        if(hasBeachBall)
            return "The dolphin plays with the beachball and is having a splendid day.";
        return "The dolphin is depressed at his severe lack of beachball.  He shoots lasers.";
    }
    public String eat()
    {
        return "mmm, fish";
    }
    public String makeNoise()
    {
        return "EEEEeeeeEEEEeeeeEEEEeeeeEEEEeeeeEEEEeeeeEEEEeeee";
    }
    
    
}
