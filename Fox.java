import java.io.InputStream;
/**
 * Write a description of class Fox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fox extends Animal implements Roamable
{
    public String toy; 
    public String food;
    public Fox(String name, String desc)
    {
        super(desc, name);
    }
    public String play()
    {
        if(Math.random() > .3 && Math.random() < .5)
        {
            toy = "ball";
        }
        else if(Math.random() < .3)
        {
            toy = "... oh god I hope that's not a body part.";
        }
        else 
        {
          toy = "a suspicious item";
        }
        return " The fox plays with " + toy;
    }
    public String eat()
    {
        if(Math.random() > .3 && Math.random() < .6)
        {
            food = " finally catches a small child and drags it back to its den";
        }
        else if(Math.random() < .3)
        {
            food = " seems to be chewing on some kind of leftovers";
        }
        else 
        {
          food = " is eating a large juicy looking steak";
        }
        return "The fox" + food;
    }
    public String sleep()
    {
        return "The fox never sleeps, it is eternal, it is all knowing..."
        + " It fell over form exhaustion.";
    }
    public String makeNoise()
    {
        // import audio file of that norwegian song.
        return "*Fox Noise*";
    }
    public String roam()
    {
        return "The fox rushes about looking for easy prey and shiny objects";
    }
    public String move()
    {
        return "The fox sprints back and forth for seemingly no apparent reason.";
    }
}
