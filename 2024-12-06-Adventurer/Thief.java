public class Thief extends Adventurer
{
    public Thief (String name)
    {
        super(name, 11);
    }
    public Thief (String name, int hp)
    {
        super(name, 15);
    }

    public String getSpecialName() {return "Plunder";}
    //accessor methods
    private int boldness; // idk? thieves need to be brave to steal, i guess
    public int getSpecial() {return boldness;}
    public void setSpecial(int n) {boldness = n;}
    public int getSpecialMax() {return 10;}

    //hurt or hinder the target adventurer
    public String attack(Adventurer other)
    {return "";}
    
    //heal or buff the target adventurer
    public String support(Adventurer other){return "";}

    //heal or buff self
    public String support() {return "";}

    //hurt or hinder the target adventurer, consume some special resource
    public String specialAttack(Adventurer other) {return "";}
}