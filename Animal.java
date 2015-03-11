/**
 * This is the Animal Class for the Zoo. 
 * 
 * @Adam Espinoza 
 * @2015-03-11
 */
public abstract class Animal
{
    /*#
     * All animals that inherit from this class
     * MUST OVERRIDE the following methods. 
     */
    public abstract String play();
    
    public String sleep()
    {
        return "Zzzzzz.....";
    }
  
    public abstract String eat();
    
    public abstract String makeNoise();
    
    public abstract String move();
}
