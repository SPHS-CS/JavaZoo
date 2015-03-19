
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blobfish extends Animal implements Swimmable
{
  @Override
    public String play()
  {
      return "The mighty blobfish takes out it's baton and twirls it . . . it is a distraction and you have died.";
  }
  @Override
  public String sleep()
  {
      return "The blobfish never sleeps . . . you have died.";
  }
  @Override
  public String eat()
  {
      return "The blobfish slowly begins to consume it's whole tank. The glass breaks . . . you have died.";
  }
  @Override
  public String makeNoise()
  {
      return "The blobfish is a silent killer . . . you have died.";
  }
  @Override
  public String move()
  {
      return "The blobfish hides behind a veil of smoke. It appears behind you . . . you have died.";
  }
  public String swim()
  {
      return "The blobfish swims stealthily . . . it decides you are not worth killing.";
  }
}