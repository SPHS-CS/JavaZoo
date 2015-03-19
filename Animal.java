
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Animal
{
    private String description;
    private String name;

    public Animal(String desc, String name)
    {
        this.description = desc;
        this.name = name;
    }

    public Animal()
    {
        description = "This is a generic animal.  Change it!";
        name = "Animal Something";
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String desc)
    {
        this.description = desc;
    }
    /*#
     * All animals that inherit from this class
     * MUST OVERRIDE the following methods.
     */
    public abstract String play();

    public String sleep()
    {
        return "Zzzzzz...";
    }

    public abstract String eat();

    public abstract String makeNoise();

    public abstract String move();
}
