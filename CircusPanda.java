
/**
 * Write a description of class CircusPanda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircusPanda extends Panda
{
    /*# Constructors */
    //Constructor that take no arguments
    public CircusPanda()
    {
         super("This is a panda from China", "(no name assigned)", "(no toy assigned)");
    }
    //Constructor that only take the name
    public CircusPanda(String name)
    {
         super("(no description assigned)", name, "(no toy assigned)");
    }
    //Constructor that take name and description and toy
    public CircusPanda(String description, String name, String toy)
    {
         super(description, name, toy);
    }
    
    
     /*# Methods */
    @Override
    public String play()
    {
        double value = Math.random();
        if(value>=0.5)
        {
            return getName()+" puts on his hat and rides his tricycle";}
        else
        {
            return super.play();
        }
    }
}
