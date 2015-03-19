
/**
 * Write a description of class AstroSloth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AstroSloth extends Sloth implements Flyable
{
    /**
     * Constructor for objects of class AstroSloth
     */
    public AstroSloth(String desc, String name)
    {
       super(desc,name);
    }

    public String fly()
    {
        return "He happpily climbs aboard his space ship and blasts off, happy the he can finaly go" +
                " faster than all the other animals in the forest";
    }
    
    public String sleep()
    {
        return "He gently falls asleep, dreaming if the stars and his trips to them in his space vessel";
    }
}
