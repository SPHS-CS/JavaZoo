
/**
 * Write a description of class Lynx here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lynx extends Animal implements Roamable
{
    
    public Lynx(String inputDescription, String inputName)
    {
        super(inputDescription, inputName);
    }
 
    public String move()
    {
        return "The lynx walks around its cage, hiding in the grass, like the lynx do.";
    }
    
    public String makeNoise()
    {
        return "The lynx purrs quietly, like the lynx do.";
    }
    
    public String eat()
    {
        return "The lynx hunts down a mouse in its cage and eats it, like the lynx do.";
    }
    
    public String play()
    {
        return "The lynx walks over and playfully pokes its friend, like the lynx do.";
    }
    
    public String roam()
    {
        return "The lynx roams around, stalking its prey, like the lynx do.";
    }
}
