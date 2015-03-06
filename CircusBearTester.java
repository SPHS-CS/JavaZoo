
/**
 * Write a description of class CircusBearTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircusBearTester
{
    public static void main(String[] args)
    {
        Bear klaus = new Bear();
        CircusBear casey = new CircusBear();
        System.out.println(klaus.roar());
        System.out.println(casey.roar());
        System.out.println(klaus.play());
        System.out.println(casey.play());
    }
}
