
/**
 * Write a description of class DireWolf here.
 * 
 * @author (Jacob Ley-Sanchez) 
 * @version (a version number or a date)
 */
public class DireWolf extends Animal implements Roamable
{
    public String move()
    {
        return "The Direwolf struts forward, growling menacingly.";
    }
    public String makeNoise()
    {
        return "It releases a loud menacing howl in the defence of the North.";
    }
    public String eat()
    {
        return "The direwolf feasts on the bones of Lannisters.";
    }
    public String play()
    {
        return "Direwolves do not play, they hunt.";
    }
    public String roam()
    {
        return "The direwolf stalks its prey, slowly and calculatingly.";
    }
    public String speak()
    {
        //find an audio file for this.
        return "Winter is Coming";
    }
}
