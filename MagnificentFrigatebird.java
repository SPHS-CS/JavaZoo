import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class GreaterFrigatebird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagnificentFrigatebird 
{
    private String appearance;
    private List<String> foods;
    private List<String> toys;
    public MagnificentFrigatebird()
    {
        appearance = " This is a large black seabird with a bright red throat and sharp beak."
        +"\n It looks like it has two tails but it doesn't."
        +"\n Kinda looks like a Pterodactyl but very feathery less leathery."
        +"\n If you really don't know what it looks like go Google it...";
        foods = new ArrayList<String>();
        foods.add("a very large herring");
        foods.add("several anchovies");
        foods.add("Nemo and Dory");
        foods.add("some shrimp");
        foods.add("a pigeon");
        foods.add("the lunch you packed");
        toys= new ArrayList<String>();
        toys.add("pigeon");
        toys.add("seagull");
        toys.add("parrot");
        toys.add("dragon");
        toys.add("Duck");
        toys.add("pegsus");
        toys.add("Doge");
        toys.add("shark");
    }
    public String roar()
    {
        return "Screeeeeeeeeeeeeeeee";
    }
    public String sleep()
    {
        return "ZzzzzZzzzZzzz";
    }
    public String play()
    {
        String playing ="";
        for(String toy: toys)
        {
            playing +="The Magnificent Frigatebird was bored so he chased a " + toys + "until it got tired.";
        }
        return playing;
    }
    public String eat()
    {
        String eating = "";
        for(String food: foods)
        {
            eating += "The Magnificent Frigatebird swoops down out of the sky and eats "+ food +"!\n";
        }
        return eating;
    }
}
