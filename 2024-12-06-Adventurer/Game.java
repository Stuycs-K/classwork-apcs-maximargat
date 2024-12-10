import java.util.Scanner;
public class Game
{
    static String[] names = {"Ted", "Bill", "Woods", "Joe", "Benneth", "Samuel", "Axel", "Leo", "Casio Calculator", "TI-83 Plus Graphing Calculator"};
    public static void main (String[] args)
    {
        Scanner inputsc = new Scanner(System.in);

        int firstname = (int)(Math.random() * names.length);
        int secondname = (int)(Math.random() * names.length);
        while(firstname == secondname)
        {
            secondname = (int)(Math.random() * names.length); // sets different names and hopefully doesn't infinitely loop
        }
        Thief myguy = new Thief(names[firstname]);
        CodeWarrior otherguy = new CodeWarrior(names[secondname]);

        boolean printnextloop = true;
        while(myguy.getHP() > 0 && otherguy.getHP() > 0)
        {
            // run turn
            /*
            Now if the opponent is still alive (HP > 0) have the computer randomly choose to have the opponent attack/special attack the player, or buff themselves.
            Print the results of the action
            */

            //print the names / HP / SpecialResource(quantity+name) of both the player and enemy. e.g. Conan, 5/16 HP, 19/20 Rage
            if(printnextloop)
                System.out.println(info(myguy) + "\n" + info(otherguy));
            printnextloop = true;

            String input = inputsc.nextLine();

            if(input.equals("a") | input.equals("attack"))
            {
                System.out.println(myguy.attack(otherguy));
            }
            else if(input.equals("sp") | input.equals("special"))
            {
                System.out.println(myguy.specialAttack(otherguy));
            }
            else if(input.equals("su") | input.equals("support"))
            {
                System.out.println(myguy.support());
            }
            else if(input.equals("quit"))
            {
                break;
            }
            else
            {
                // invalid input
                System.out.print("Invalid input, please (a)ttack, (sp)ecial, (su)pport, or quit ");
                printnextloop = false;
                continue;
            }

            if(otherguy.getHP() > 0)
            {

            }
            else
            {
                System.out.println(otherguy.getName() + " is no more.");
                System.out.println(myguy.getName() + " won with " + myguy.getHP() + " HP remaining!");
                break;
            }

        }
    }

    public static String info(Adventurer guy) // copied from Driver
    {
        return guy.getName() + ":  HP = " + guy.getHP() + ", Special = " + guy.getSpecial();
    }
}