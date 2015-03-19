import java.util.List;
/**
 * Write a description of class Dinosaur here.
 * 
 * @author (Joanna Wan) 
 * @version (a version number or a date)
 */
public class Dinosaur extends Animal implements Roamable
{
    
    /**
     * Constructor for objects of class Dinosaur
     */
 
    public Dinosaur(String name, String description)
    {
        super(name, description);
    }
    
    @Override
    public String roam()
    {
        return "RAAAAAAAAAAWWWWWWRRRRRRRRRRRR";
    }
    
    @Override
    public String makeNoise()
    {
        return "RAAAAAAAAAAWWWWWWRRRRRRRRRRRR";
    }
    
    @Override
    public String sleep()
    {
        return "zzzzZZZzz";
    }
    
    @Override
    public String play()
    {
        return "The dinosaur plays with an egg.";
    }
    
    @Override
    public String eat()
    {
        return "The dinosaur cracks open an ostrich egg and eats it";
    }
    
    @Override
    public String move()
    {
        return "The dinosaur runs around the tree.";
    }
    
    
}
