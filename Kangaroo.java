import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Kangaroo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangaroo extends Animal implements Roamable
{
    private List<String> toys;
    /**
     * Constructor for objects of class Kangaroo
     */
    public Kangaroo(String name, String description, String toy)
    {
        super(description, name);
        toys = new ArrayList<String>();
        toys.add(toy);
    }

    public Kangaroo()
    {
        super("A genetically engineered kangaroo who was the result of a military experiment conducted by " +
            "Doctor Gepetto Bosconovitch while under employment of the Mishima Zaibatsu in Tekken 2.", "Roger");
        toys = new ArrayList<String>();
        toys.add("Boxing gloves");
    }

    public String roam()
    {
        return "The kangaroo jumps around very happily.";
    }

    @Override
    public String makeNoise()
    {
        return "BRAARAAAWRAAAARR";
    }

    @Override
    public String sleep()
    {
        return "zzzzzzzzz";
    }

    @Override
    public String play()
    {
        String playing = "";
        for(String toy : toys)
        {
            playing += "Roger puts his "+ toy +" and compete in Iron Fist Tournament";
        }
        return playing;
    }

    @Override
    public String eat()
    {
        return "Roger eats the grasses and drink human blood";
    }

    @Override
    public String move()
    {
        return "Roger backflips and beats his bongo.";
    }

    public List<String> getToys()
    {
        return toys;

    }
}
