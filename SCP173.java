import java.util.List; 
/**
 * SCP-173 is constructed from concrete and rebar with traces of Krylon brand spray paint. 
 * SCP-173 is animate and extremely hostile, though the object cannot move 
 *      while within a direct line of sight.
 * Line of sight must not be broken at any time with SCP-173. 
 * 
 * @Adam Espinoza 
 * @2015-19-03
 */
public class SCP173 extends Animal implements Roamable
{

    /**
     * Constructor for objects of class SCP-173
     */
    public SCP173(String name, String description)
    {
        super(name,description);  
    }

    /**
     *  This tells the person viewing SCP-173 that things aren't going so well. 
     */
    @Override
    public String move()
    {
        return "The creature does not move at all. You feel an over-arching sense that something is wrong."
            + "/nYou should probably leave the containment before it is breached."; 
    }
    
    @Override
    public String makeNoise()
    {
        return "SCP-173 does not make any noise. It stares are you blankly.";
    }
    
    @Override
    public String eat()
    {
        return "A personnel is thrown into the pit and SCP-173 breaks it neck. The man is absorbed.";
    }
    
    @Override 
    public String play()
    {
        return "The animal does not understand what you mean. It just stands there menicingly.";
    }
    
   	 @Override 
    public String teleport()
    {
        if(Math.random() < .5) 
        {
            return "The SCP teleports and snaps your neck. You failed by blinking. Thankfully the Zoo keepers revive you.";
        }
        else
        {
            return "The SCP teleports and you catch view of him before he kills you. You walk away from it staring at its soul.";
        }
    }
    
    @Override 
    public String roam() 
    {
        return "The SCP teleports sparratically throughout the room hitting the walls.";
    }
    
    public String poop()
    {
        return "The SCP releases a red and brown substance from it's behind. It's best to stay away.";
    }
}
