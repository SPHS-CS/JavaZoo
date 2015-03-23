
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blobfish extends Animal
{
<<<<<<< Updated upstream
  public String play()
=======
  public Blobfish(String desc, String name)
  {
      super(desc, name);
  }
    @Override
    public String play()
>>>>>>> Stashed changes
  {
      return "The mighty blobfish takes out it's baton and twirls it . . . it is a distraction and you have died.";
  }
  @Override
  public String sleep()
  {
      return "The blobfish never sleeps . . . you have died.";
  }
  public String eat()
  {
      return "The blobfish slowly begins to consume it's whole tank. The glass breaks . . . you have died.";
  }
  public String makeNoise()
  {
      return "The blobfish is a silent killer . . . you have died.";
  }
  public String move()
  {
      return "The blowfish hides behind a veil of smoke. It appears behind you . . . you have died.";
  } 
}