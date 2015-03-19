
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class asdf here.
 * 
 * @author Alex Kim
 * @version 3-19-15
 */
public class SaviorThePhoenix extends Phoenix
{
    private String description;
    private List<String> toys;
    /**
     * Constructor for objects of class CircusBear
     */
    public SaviorThePhoenix(String desc, String name)
    {
        super(desc, name);
        toys = new ArrayList<String>();
        toys.add("Fire");
        toys.add("Starcraft");
    }

    @Override
    public String play()
    {
         return "sAviOr is the king of Starcraft matchfixing, nicknamed the phoenix.";
    }
}
