import java.util.Scanner;

// Maxim and Arko
public class Scanny
{
    static String whatever = "According to all known laws of aviation, there is no way a bee should be able to fly.";
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(whatever);
        while(sc.hasNext())
        {
            System.out.println(sc.next());
        }
    }
}