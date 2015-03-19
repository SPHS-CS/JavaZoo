
/**
 * Write a description of class Sloth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sloth extends Animal implements Roamable
{

    /**
     * Constructor for objects of class Sloth
     */
    public Sloth(String desc, String name)
    {
        super(desc,name);
    }
    
    public Sloth()
    {
        super("A general sloth", "Mr. Sloth");
    }

    public String roam()
    {
        return "The majestic sloth slowly roams his vast expanse that consist of al of 1 tree";
    }
    
    public String play()
    {
        return " The sloth tries to play a game but falls asleep instead";
    }
     
    public String eat()
    {
        return "He slowly rips a leaf off of a branch and puts it in his mouth";
    }

    public String makeNoise()
    {
        return "Meeeep";
    }

    public String move()
    {
        return "He tries to move up the tree but falls, losing three weeks of progress";
    }
    
    public String sleep()
    {
        return "The sloths does as all sloths do and falls asleep on his favorite branch";
    }
}
