
/**
 * Write a description of class SeaWorldRescueDolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SeaWorldRescueDolphin extends Dolphin
{
    

    /**
     * Constructor for objects of class SeaWorldRescueDolphin
     */
    public SeaWorldRescueDolphin(String description, String name, boolean hasBall)
    {
            super(description, name, hasBall);
    }

    @Override
    public String play()
    {
        if(Math.random() < 0.5)
            return super.play();
        else      
            return "The dolphin does forty backflips, shooting lasers continuously making a spiral of destruction.";
  
    }
    
}








