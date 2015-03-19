
/**
 * Abstract class Hedgehog - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Hedgehog extends Animal implements Swimmable, Roamable
{
    public Hedgehog(String name)
    {
        super("A super cute hedgehog.", name);        
    }
    
    @Override
    public String eat()
    {
      return "The hedgehog is on a diet and nibbling on a leaf.";
    }

    @Override
    public String swim()
    {
        return "The hedgehog is floating and paddling around in the bathtub";
    }

    @Override
    public String move()
    {
        return "The hedgehog is curling up into a ball";
    }

    @Override
    public String play()
    {
        return "The hedgehog is making noodles with fellow hedgehog classmates";
    }
    
    @Override
    public String makeNoise()
    {
        return "oink mooo meow chirp I'M SINGING IN THE RAIN I'M SINGING IN THE RAINNN";       
    }
    
    @Override
    public String roam()
    {
        return "The hedgehog is rolling around the room";
    }

}
