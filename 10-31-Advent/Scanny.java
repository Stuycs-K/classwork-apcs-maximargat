import java.util.Scanner;

// Maxim and Arko
public class Scanny
{
    static String whatever = "According to all known laws of aviation, there is no way a bee should be able to fly.";
    public static void main(String[] args)
    {
        /*Scanner sc = new Scanner(whatever);
        while(sc.hasNext())
        {
            System.out.println(sc.next());
        }*/
        Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2"); // should be around 111
        double sum = 0;
        while(sc2.hasNextDouble())
        {
            sum += sc2.nextDouble();
        }
        System.out.println(sum);
    }
}