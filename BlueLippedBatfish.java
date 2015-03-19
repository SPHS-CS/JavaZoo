
/**
 * Write a description of class BlueLippedBatfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueLippedBatfish extends RedLippedBatfish implements Swimmable
{
    // instance variables - replace the example below with your own
    private int x;

    
    public BlueLippedBatfish(String name, String description)
    {
        super(name,description);
    }

    @Override 
    public String move()
    {
        return "All the blue-lipped batfish ever wanted was to be a red-lipped batfish. It puts on bright red lipstick.";
    }

    @Override 
    public String makeNoise()
    {
        return "All the blue-lipped batfish ever wanted was to be a red-lipped batfish. It contemplates getting a red tattoo on its lips so they will always be red.";
    }

    @Override 
    public String eat()
    {
         return "All the blue-lipped batfish ever wanted was to be a red-lipped batfish. It eats a human so its lips are stained red by the human's blood.";
    }

    @Override 
    public String play()
    {
         return "All the blue-lipped batfish ever wanted was to be a red-lipped batfish. It murders a red-lipped batfish and steals its lips.";
    }

    @Override 
    public String swim()
    {
         return "All the blue-lipped batfish ever wanted was to be a red-lipped batfish. It dies.";
    }
}
