
/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiger extends Animal implements Roamable
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Tiger
     */
    public Tiger()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public String move()
    {
        return "The tiger walks around in the woods.";
    }
    
    @Override
    public String makeNoise()
    {
        return "ROARRRRRRRRRRRR!";
    }
    
    @Override
    public String eat()
    {
        return "The tiger jumps out and eats a man.";
    }

    @Override
    public String play()
    {
        return "The tiger plays with his teddy bear.";
    }
    
    public String roam()
    {
        return "The tiger roams.";
    }
}
