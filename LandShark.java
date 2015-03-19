
/**
 * Write a description of class LandShark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandShark extends Shark
{
    public LandShark(String name, String description)
    {
        super(name, description);
    }

    @Override
    public String eat()
    {
        return "The land shark leaves the water and eats a fat human child.";
    }
}
