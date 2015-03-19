
/**
 * Write a description of class retyu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chicken extends Animal
{
    // instance variables - replace the example below with your own
    public Chicken(String description, String name)
    {
        super(description, name);
    }
    
    public Chicken()
    {
        super("A general chicken." , "General Chicken");
    }
    
    
    public String makeNoise()
    {
        return "cluck cluck cluck.";
    }
    
    public String sleep()
    {
        return "zzzzzzz";
    }
    
    public String layEggs()
    {
        return "The chicken layed an egg";
    }
    
    public String eat()
    {
        return "The chicken starts pecking at the chicken feed on the ground";
    }
    
    public String move()
    {
        return "The chicken walks forward while bobbing its head";
    }
    
    public String play()
    {
        return "The chicken plays with the other chickens";
    }
    
}
