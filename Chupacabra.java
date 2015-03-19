public class Chupacabra extends Animal implements Roamable
{
    public Chupacabra(String name, String description)
    {
        super(name, description);
    }
    public String move()
    {
        return "The chupacabra scurries about.";
    }
    public String roam()
    {
        return "The chupacabra skulks about, muttering something about his wife making him eat fat-free goats.";
    }
    public String eat()
    {
        return "The chupacabra feasts on low fat soymilk because he has gone vegan.";
    }
    public String makeNoise()
    {
        return "nyyyyaaaaaaaahhhhhh";
    }
    public String play()
    {
        return "The chupacabra slips deeper into depression and alcoholism, racking his brain as to why his wife left him.";
    }
    public String goatSuck()
    {
        return "The chupacabra cries silently, distraught after realizing the monster he has become.";
    }
}