/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Raptor extends Animal implements Roamable
{
    private String description;
    private String name;

    public Raptor(String desc, String name)
    {
        this.description = desc;
        this.name = name;
    }

    public Raptor()
    {
        description = "This is the ever so elegant Velociraptor, also known as its nickname, 'The Raptor,' is a fierce yet majestic being that regrets nothing.";
        name = "Raptor";
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    /*#
     * All animals that inherit from this class
     * MUST OVERRIDE the following methods.
     */
    @Override
    public  String play()
    {
        return "The raptor claws his raptor homie.";
    }

    public String sleep()
    {
        return "Zzzzzz...";
    }
    
    @Override
    public  String eat()
    {
        return "The raptor runs off with a bunny in his mouth.";
    }

    @Override
    public  String makeNoise()
    {
        return "CRIck.....CRIck";
    }

    @Override
    public  String move()
    {
        return "The raptor runs through his dense jungle enclosement at a near super-sonic speed."; 
    }
}