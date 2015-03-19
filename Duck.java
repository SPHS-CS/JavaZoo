import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duck extends Animal implements Flyable, Swimmable
{
    
    /**
     * Constructor for objects of class Bear
     */
    public Duck(String description, String name)
    {
        super(description, name);
    }

    public Duck()
    {
        super("A swole duck.", "Scrooge McDuck");
    }
    
    @Override
    public String makeNoise()
    {
        return "MoooOOoooOOOooo";
    }
    
    @Override
    public String sleep()
    {
        return "Oinkkkk";
    }
    
    @Override
    public String play()
    {
        String playing = "";       
        playing += "The duck ducks";        
        return playing;
    }
    
    @Override
    public String eat()
    {
        return "The duck ducks on bread";
    }
    
    @Override
    public String move()
    {
        return "The duck ducks around";
    }
    
    @Override
    public String swim()
    {
        return "The Duck ducks around in the water";
    }
    
    @Override
    public String fly()
    {
        return "The Ducks ducks around in the air";
    }
    
    
}