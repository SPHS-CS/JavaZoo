
/**
 * Write a description of class CircusBear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircusBear extends Bear
{
    public CircusBear (String name, String description, String toy)
    {
        super(name, description, toy);
    }


    @Override
    public String play()
    {
        double value = Math.random();
        if(value>=0.5)
        {
            return "Casey puts on his hat and rides his tricycle";}
        else
        {
            return super.play();
        }
    }

    
}
