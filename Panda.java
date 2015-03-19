
/**
 * This is a class of Panda
 * 
 * @author (Michael Tu) 
 * @version (2015-03-19)
 */
public class Panda extends Bear
{
    /*# Constructors */
    //Constructor that take no arguments
    public Panda()
    {
         super("This is a panda from China", "(no name assigned)", "(no toy assigned)");
    }
    //Constructor that only take the name
    public Panda(String name)
    {
         super("(no description assigned)", name, "(no toy assigned)");
    }
    //Constructor that take name and description and toy
    public Panda(String description, String name, String toy)
    {
         super(description, name, toy);
    }
    
    /*# Methods */
    @Override
    public String makeNoise()
    {      
        return "RAAAAAAAAAAWR!\n'I want bamboo, please!'";
    }
    
    @Override
    public String eat()
    {
        //70% of change eat bamboos, 30% of change eat volunteers
        return Math.random() < 0.3 ? super.eat():getName()+" reaches a pile of bamboos and starts eating";
    }
    
    @Override
    public String move()
    {
        //70% of change doesn't move, 30% of change move as regular bears
        return Math.random() < 0.3 ? super.move():getName()+" is too lazy to move";
    }
}
