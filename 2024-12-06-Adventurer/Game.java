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

        
        while(myguy.getHP() > 0 && otherguy.getHP() > 0)
        {
            // run turn
            /*
            Prompt the user: "Type: (a)ttack / (sp)ecial / (su)pport" / quit
            The user can type a/attack to select attack, or type sp/special to do a special attack, or su/support to support themselves. You then make the character use the appropriate action.
            If the user types quit, end the program.
            If an invalid response is typed, ask again until the response is valid.
            Print the results of the action.
            Now if the opponent is still alive (HP > 0) have the computer randomly choose to have the opponent attack/special attack the player, or buff themselves.
            Print the results of the action
            */

            //print the names / HP / SpecialResource(quantity+name) of both the player and enemy. e.g. Conan, 5/16 HP, 19/20 Rage
            System.out.println(info(myguy) + "\n" + info(otherguy));

            String input = inputsc.nextLine();

            if(input.equals("a") | input.equals("attack"))
            {
                System.out.println("attack");
            }
            if(input.equals("sp") | input.equals("special"))
            {
                System.out.println("special");
            }
            if(input.equals("su") | input.equals("support"))
            {
                System.out.println("support");
            }
            if(input.equals("quit"))
            {
                break;
            }

        }
        

        // print results
        System.out.println(info(myguy) + "\n" + info(otherguy));

    }

    public static String info(Adventurer guy) // copied from Driver
    {
        return guy.getName() + ":  HP = " + guy.getHP() + ", Special = " + guy.getSpecial();
    }
}