
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class asdf here.
 * 
 * @author Alex Kim 
 * @version 3-19-15
 */
public class Phoenix extends Animal implements Flyable
{
    private String description;
    private List<String> toys;
    /**
     * Constructor for objects of class Bear
     */
    public Phoenix(String desc, String name)
    {
        super(desc, name);
        toys = new ArrayList<String>();
        toys.add("Fire");
    }
    
    public Phoenix()
    {
        super("This a legendary bird that is said to be immortal.", "");
        toys = new ArrayList<String>();
        toys.add("Fire");
    }

    @Override
    public String makeNoise()
    {
        return "주작작 주주작 주작작 주주작";
    }
    
    @Override
    public String sleep()
    {
        return "zzzzzzzzz";
    }
    
    @Override
    public String play()
    {
        String playing = "";
        for(String toy : toys)
        {
            playing += "The phoenix plays with his "+ toy +".\n";
        }
        return playing;
    }
    
    @Override
    public String eat()
    {
        return "The phoenix eats only the finest cinnamon or the occasional match fixing in Starcraft.";
    }
    
    @Override
    public String move()
    {
        return "날아오르라 주작이어";
    }
    
    @Override
    public String fly()
    {
        return "날아오르라 주작이어";
    }
}
