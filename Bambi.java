
/**
 * Write a description of class Bambi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bambi extends Deer
{
   private String name;

    /**
     * Constructor for objects of class Bambi
     */
    public Bambi()
    {
        name = "Bambi";
    }

    public String play()
    {
        return "Bambi plays with Thumper and Flower!";
    }
    
    public String move()
    {
        return "Bambi is running towards Faline!";
    }
    
    public String makeNoise()
    {
        return "Hello~Hello~ I am Bambi~~~";
    }
}
