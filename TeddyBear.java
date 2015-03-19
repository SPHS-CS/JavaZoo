
/**
 * Write a description of class Ted here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeddyBear extends Animal implements Roamable
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Ted
     */
    public TeddyBear()
    {
        super("A talking teddy bear", "Ted");
    }
    
    public TeddyBear(String desc, String name)
    {
        // initialise instance variables
        super(desc, name);
    }
    

    public String move()
    {
        // put your code here
        return "Ted walks over to get a soda";
    }
    public String play()
    {
        return "Ted starts playing with his stuffed animals";
    }
    
    public String sleep()
    {
        return "Zzzzzz... Ted snuggles with his teddy bear.";
    }

    public String eat()
    {
        return "Ted eats a churro.";
    }
        
    public String makeNoise()
    {
        return "The Ted says \"Back off. Susan Boyle.\"";
    }
    
    public String roam()
    {
        return "Ted walks around the zoo.";
    }
        
    }
    

