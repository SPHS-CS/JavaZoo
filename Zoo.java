import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;
/**
 * Test
 * 
 * @author APCSA2014-15 
 * @version 2015-03-06
 */
public class Zoo
{
    public static  void main(String[] args) throws InterruptedException 
    {
        List<Animal> animals = new ArrayList<Animal>();

        System.out.println("Welcome to the Zoo!\n");
        System.out.print("Building the cages");
        delayDots();
        System.out.print("Populating the animals");
        populateAnimals(animals);
        delayDots();
        System.out.print("Hiring zookeepers");
        delayDots();

        Scanner in = new Scanner(System.in);
        System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?");
        System.out.println("Type help to find out what you can do.\n");
        String text = in.nextLine();
        String msg = "";
        while(!text.equals("leave"))
        {
            switch(text)
            {
                case "help" : msg = "So far we can only leave and ask for help.";
                break;
                default : msg = "You flail helplessly with indecision.";
            }
            System.out.println("\n" + msg);
            System.out.println("\nYou are standing in a wondrous zoo. What would you like to do?\n");
            text = in.nextLine();
        }

        System.out.println(Math.random() < .8 ? "\nHave a nice day!  Hope you come back!" : "\nAn escaped lion eats you on your way out.  Sorry!");

    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots(int dotAmount) throws InterruptedException 
    {
        for (int i=0; i<dotAmount; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println();
    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots() throws InterruptedException 
    {
        delayDots(3);
    }

    /**
     * This is where we will all collaborate.
     * Construct your animal and add it to the List
     * @param animals the list containing all the zoo animals
     */
    public static void populateAnimals(List<Animal> animals)
    {
        Bear bear1 = new Bear("Care", "There's a weird symbol on his stomach and rainbows shooting from it.  That can't be healthy.", "A fluffy cloud.");
        Bear bear2 = new CircusBear("Fez", "This bear wears a fez and looks somewhat forlorn.", "colorful beach ball");
        Frog frog1 = new Frog();
        Frog frog2 = new PrinceFrog();
        animals.add(bear1);
        animals.add(bear2);
        animals.add(frog1);
        animals.add(frog2);
        Shark shark1 = new Shark("Jaws", "All you see are rows upon rows of teeth.");
        Blobfish blobfish1 = new Blobfish("Blobert", "The blobfish seems innocent, but beware.");
        FlyingBlobfish blobfish2 = new FlyingBlobfish("Bloberto", "The blobfish seems innocent, but beware.");
        animals.add(bear1);
        animals.add(blobfish1);
        animals.add(blobfish2);
        animals.add(bear2);
        animals.add(shark1);
        //Tiger tiger1 = new Tiger("Bob Smith", "This tiger loves to eat and sleep.");
        //animals.add(tiger1);

        //Deer deer1 = new Deer("Lily", "This is a cute cute deer.");
        //Deer deer2 = new Bambi("Bambi", "Hi! This is Bambi!");
        //animals.add(deer1);
        //animals.add(deer2);
        Fox fox1 = new Fox("Red: 255 Green: 255 Blue: 255","Al Capone");
        animals.add(fox1);

        Duck duck1 = new Duck("Wow, that duck has 17 inch arms. He is a swole duck.", "Barbara Streisand");
        Duck ducktator = new Duck("The duck seems to be leading all the other ducks in unison to mine the rocks.....", "Ducktator Kim Duck Un");
        animals.add(ducktator);
        animals.add(duck1);
        Dragon dragon1 = new Dragon("Swag Master", "Very unpleasant attitude, he refuses to cooperate with any authority.");
        Dragon dragon2 = new Dragon("Wisdom", "Having lived for centuries, this old, white-bearded dragon speak with more authority than the zoo director himself.");
        animals.add(dragon1);
        animals.add(dragon2);
        Sloth sloth1 = new Sloth("He's definitely not the king of the jungle","Jorge Pip");
        Sloth sloth2 = new AstroSloth("The best sloth astronaut you've ever seen, because he's the only one"
                    , "Buzz Slothstrong");
        animals.add(sloth1);
        animals.add(sloth2);
    }
}

