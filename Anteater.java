/**
 * This is a class to create a general roaming anteater
 * 
 * @author Olivia Miskala-Dinc 
 * @version 12/1/2022
 */

public class Anteater  extends Animal implements Roamable {

    public Anteater()
    {
        super("A general Anteater." , "General Anteater");
    }

    @Override
    public String roam() {
        return "Walks about in search of ants";
    }

    @Override
    public String play() {
        return "Tumbles around";
    }

    @Override
    public String eat() {
        return "Slurps up a tasty anthill";
    }

    @Override
    public String makeNoise() {
        return "ZOT ZOT ZOT!";
    }

    @Override
    public String move() {
        return "Wiggles long snout";
    }
    
}
