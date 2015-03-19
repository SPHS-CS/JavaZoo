
/**
 * Write a description of class RedLippedBatfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedLippedBatfish extends Animal implements Swimmable

{
    // instance variables - replace the example below with your own
    private int x;
    public RedLippedBatfish(String name, String description)
    {
        super(name,description);
    }

    @Override 
    public String move()
    {
        return "The red-lipped batfish shuffles along the ocean floor, looking so something to kiss.";
    }

    @Override 
    public String makeNoise()
    {
        return "The red-lipped batfish makes kissy noises with its lips.";
    }

    @Override 
    public String eat()
    {
        return "The red-lipped batfish eats a scuba diver.";
    }

    @Override 
    public String play()
    {
        return "The red-lipped batfish kisses a shark. It is eaten.";
    }

    @Override 
    public String swim()
    {
        return "The red-lipped batfish tries to swim, but fails miserably even thought it lives in the water. It continues to walk along the ocean floor, looking for something to kiss";
    }
}
