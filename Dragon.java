import java.util.List;
import java.util.ArrayList;
/**
 * This is the coding for the JavaZoo's new dragon. Period 1
 * 
 * @author Jaehyung Choi 
 * @version 2015-03-19
 */
public class Dragon extends Animal implements Flyable, Swimmable
{
    private String appearance;
    private List<String> treasures;
    /**
     * Constructor for objects of class Bear
     */
    public Dragon()
    {
        appearance = "This is a ferocious looking dragon, with colorful scales and magnificent wings."
                       +" Its teeth are very sharp and its eyes are mesmerizing.";
        treasures = new ArrayList<String>();
        treasures.add("Golden crown of the King of the Nile");
        treasures.add("Tibetan singing bowl of Grandmaster Shorr");
        treasures.add("Wand stolen from Voldemort himself");
        treasures.add("Macbook of the all powerful Master Ooda");
        treasures.add("Silver banana of the HubbyWubby");
        treasures.add("Cup of swag from the Essence of the World");
        treasures.add("Rug woven from Mr. Shorr's beard");
    }
    
    public String roar()
    {
        return "RAAAAAAAAAAWR";
    }
    
    public String breathe()
    {
        return "The dragon just burnt a visitor to crisp.";
    }
    
    public String prophesize()
    {
        return "The dragon speaks a wise and mysterious prophecy.";
    }
    
    @Override
    public String sleep()
    {
        return "zzzzzzzzz";
    }
    
    @Override
    public String play()
    {
        String playing = "";
        for(String rich : treasures)
        {
            playing += "The dragon admires his "+ rich +".\n";
        }
        return playing;
    }
    
    @Override
    public String eat()
    {
        return "The dragon devours its mid-lunch snack: a full grown elephant.";
    }
    
    @Override
    public String move()
    {
        return fly();
    }
    
    public String fly()
    {
        return "The dragon flies up and breaks through the bars, causing havoc and mayhem in the city.";
    }
    
    @Override
    public String makeNoise()
    {
        return roar();
    }
    
    public String roam()
    {
        return "The dragon breaks out of the zoo and roams the countryside, terrorizing the villagers.";
    }
    
    public String swim()
    {
        return "The dragon swims in the river, enjoying himself as he basks in the warm flow of sunlight.";
    }
}
