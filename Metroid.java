
/**
 * The Metroid is a creature that is feared across the universe. Don't let it eat your face off.
 * 
 * @author Jaydon Krooss
 * @version 3/19/15
 */
public class Metroid extends Animal implements Flyable
{
    
    /**
     * Constructor for objects of class Metroid
     */
    public Metroid(String name, String desc)
    {
        super(desc, name);
    }
    
    public String fly() {
        return getName() + " uses it's stored kinetic energy to hover into the air, searching for prey.";
    }
    
    public String play() {
        return getName() + " floats around you playfully. Watch out for those mandibles";
    }
    
    public String eat() {
        return getName() + "sucks out the life energy of a nearby civilian.";
    }
    
    public String makeNoise() {
        return "Squee...";
    }
    
    public String move(){
        return getName() + " hovers about.";
    }
}
