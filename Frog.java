import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Frog here.
 * 
 * @author Sheldon Zhu 
 * @version 2015-03-19
 */
public class Frog extends Animal implements Swimmable, Roamable
{
    private List<String> toys;
    
    public Frog()
    {
        super("A typical green frog that appears to be staring straight into your soul.", "Rupert");
        toys = new ArrayList<String>();
        toys.add("Barbie Doll");
    }
    
    public Frog(String desc, String name)
    {
        super (desc, name);
        toys = new ArrayList<String>();
        toys.add("Barbie Doll");
    }
    
    @Override
    public String play()
    {
        String playing = "";
        for(String toy : toys)
        {
            playing += (getName() + " plays with his "+ toy +".\n");
        }
        return playing;
    }
    
    @Override
    public String sleep()
    {
        return "Zzzzzzz...";
    }
    
    @Override
    public String eat()
    {
        return getName() + "'s tongue darts out and plucks a fly out of the air.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Ribbit";
    }
    
    @Override
    public String move()
    {
        return getName() + " leaps straight out of its tank and stares into your very being.";
    }
    
    public String swim()
    {
        return getName() + " hops in the water and wades around for a minute.";
    }
    
    public String roam()
    {
        return getName() + " hops out of his tank and roams around the zoo, as if searching for something.";
    }
}

