
/**
 * Write a description of class IberianLynx here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IberianLynx extends Lynx
{
    public IberianLynx(String inputDescription, String inputName)
    {
        super(inputDescription, inputName);
    }

    @Override
    public String move()
    {
        return "The lynx walks around its cage endangeredly, hiding in the grass, like the lynx do.";
    }
    
    @Override
    public String makeNoise()
    {
        return "The lynx purrs quietly but endangeredly, like the lynx do.";
    }
    
    @Override
    public String eat()
    {
        return "The lynx hunts down a mouse in its cage and eats it endangeredly, like the lynx do.";
    }
    
    @Override
    public String play()
    {
        return "The lynx walks over and playfully pokes its friend endangeredly, like the lynx do.";
    }
    
    @Override
    public String roam()
    {
        return "The lynx roams around, stalking its prey endangeredly, like the lynx do.";
    }
    
}
