import java.util.Scanner;
public class Game
{
    static String[] names = {"Ted", "Bill", "Woods", "Joe", "Benneth", "Samuel", "Axel", "Leo", "Casio Calculator", "TI-83 Plus Graphing Calculator"};
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int firstname = (int)(Math.random() * names.length);
        int secondname = (int)(Math.random() * names.length);
        while(firstname == secondname)
        {
            secondname = (int)(Math.random() * names.length); // sets different names and hopefully doesn't infinitely loop
        }
        Thief myguy = new Thief(names[firstname]);
        CodeWarrior otherguy = new CodeWarrior(names[secondname]);

        /*
        while(false)
        {
            
        }
        */

        // print results
        System.out.println(info(myguy) + "\n" + info(otherguy));

    }

    public static String info(Adventurer guy) // copied from Driver
    {
        return guy.getName() + ":  HP = " + guy.getHP() + ", Special = " + guy.getSpecial();
    }
}