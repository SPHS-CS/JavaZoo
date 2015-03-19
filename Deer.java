
/**
 * Write a description of class Deer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deer extends Animal
{
    private String description;
    private String name;

    /**
     * Constructor for objects of class Deer
     */
    public Deer()
    {
        name = "Deeeer";
        description = "This is a cute cute deer~";
    }

    public String play()
    {
        return "Deeeer is chasing a butterfly!";
    }
    
    public String eat()
    {
        return "Deeeer is eating an apple!";
    }
    
    public String makeNoise()
    {
        return "Deeeer kicks the fence...BANG!";
    }
    
    public String move()
    {
        return "Deeeer jumps around!";
    }
}
