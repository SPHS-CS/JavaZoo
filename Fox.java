
/**
 * Write a description of class Fox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fox extends Animal implements Roamable
{
    public String play()
    {
        return "The fox runs in circles chasing around squirrels, gophers and small children.";
    }
    public String eat()
    {
        return "The fox finally catches a smal child and drags it back to its den.";
    }
    public String sleep()
    {
        return "The fox never sleeps, it is eternal, it is all knowing... It fell over form exhaustion";
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
