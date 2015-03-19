import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class AnimalTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimalTester
{
    public static void main(String[] args)
    {
        List<Animal> animals = new ArrayList<Animal>();
        Animal alice = new Dolphin("A big dolphin", "Alice", true);


        Animal bob = new Bear();

        animals.add(alice);

        animals.add(bob);
        for(Animal a : animals)
        {
            System.out.println(a.play());
            System.out.println(a.sleep());
            System.out.println(a.makeNoise());
        }
    } 
}
