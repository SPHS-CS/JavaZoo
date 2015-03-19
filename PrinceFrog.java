
/**
 * Write a description of class PrinceFrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrinceFrog extends Frog
{
    private boolean isPrince;
    
    public PrinceFrog()
    {
        super();
        isPrince = false;
    }
    
    public PrinceFrog(String desc, String name)
    {
        super(desc, name);
        isPrince = false;
    }
    
    @Override
    public String play()
    {
        if (!isPrince)
        {
            setDescription("What once was a green ball is now a 45-year-old man lying sitting on the ground with a modest green speedo.");
            isPrince = true;
            return getName() + " leaps towards your face and kisses you on the lips.";
        }
        else
        {
            return getName() + " gently strokes the hair of his barbie doll as he whimpers to himself";
        }
    }
    
    @Override
    public String eat()
    {
        if (isPrince)
        {
            return getName() + " picks up a couple stray pieces of popcorn on the ground and pop them in his mouth.";
        }
        else
        {
            return super.eat();
        }
    }
    
    @Override
    public String makeNoise()
    {
        if (isPrince)
        {
            return getName() + " sighs deeply, as if longing for a lover long past.";
        }
        else
        {
            return super.makeNoise();
        }
    }
    
    @Override
    public String move()
    {
        if (isPrince)
        {
            return getName() + " lies onto his side and curls up into a fetal position, rocking back and forth for a while.";
        }
        else
        {
            return super.move();
        }
    }
    
    @Override
    public String swim()
    {
        if (isPrince)
        {
            return getName() + " lies in the water, crying.";
        }
        else
        {
            return super.swim();
        }
    }
    
    @Override
    public String roam()
    {
        if (isPrince)
        {
            return getName() + " walks around the park hysterically, staring into every person's eyes";
        }
        else
        {
            return super.roam();
        }
    }
}
