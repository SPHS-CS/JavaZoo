
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlyingBlobfish extends Blobfish implements Swimmable, Flyable
{
    public FlyingBlobfish(String desc, String name)
  {
      super(desc, name);
  }
  @Override
    public String play()
  {
      return "The mighty blobfish takes out it's baton and twirls it . . . it is a distraction and you have died.";
  }
  @Override
  public String eat()
  {
      return "The blobfish is perched on a rock, it seems to be devouring a human . . . it is you . . . you have died.";
  }
  @Override
  public String move()
  {
      return "The blobfish flaps it's wings and spews acid . . . you have died.";
  }
  public String swim()
  {
      return "The blobfish swims stealthily . . . it decides you are not worth killing.";
  }
    public String fly()
  {
      return "The blobfish patrols the air for its next meal . . . the prey is you . . . you have died.";
  }
}
