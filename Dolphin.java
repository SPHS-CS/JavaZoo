
/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin
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
        return "The dolphin swims about all dolphin-like.";
    }
    
    public String play()
    {
        if(hasBeachBall)
            return "The dolphin plays with the beachball and is having a splendid day.";
        return "The dolphin is depressed at his severe lack of beachball.  He shoots lasers.";
    }
    
    public String makeNoise()
    {
        return "EEEEeeeeEEEEeeeeEEEEeeeeEEEEeeeeEEEEeeeeEEEEeeee";
    }
}
