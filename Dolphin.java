
/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Animal 
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
        name = "Dolphin";
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
    
    @Override
    public String move()
    {
        return "The Dolphin moves in a swaying motion. He looks happy to see you." ;
    }
    
    @Override
    public String eat()
    {
        return "A worker throws a fish into the aqatic pit and the dolphins speed to eat the residue."; 
    }
    
    @Override
    public String sleep()
    {
        return "The dolphin stares at you with half it's brain working."; 
    }
}
