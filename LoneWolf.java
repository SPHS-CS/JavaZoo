
/**
 * Write a description of class Wolf here.
 * 
 * @author (John Scott) 
 * @version (2015-03-19)
 */
public class LoneWolf extends Wolf implements Roamable
{
    public String play()
    {
        return "The wolf runs about and does many backflips.";
    }
    public String eat()
    {
        return "The wolf eats a nearby animal.";
    }
    public String sleep()
    {
        return "The wolf falls over and sleeps.";
    }
    public String makeNoise()
    {
        return "Ahh-wwwooooooooo";
    }
    public String roam()
    {
        return "The wolf walks around looking for potential prey.";
    }
    public String move()
    {
        return "The wolf moves.";
    }
}
