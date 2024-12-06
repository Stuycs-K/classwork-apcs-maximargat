public class Driver
{
    public static void main(String[] args)
    {
        Thief thief1 = new Thief("Joe");
        Thief thief2 = new Thief("Bobert", 15);

        System.out.println(thief1 + " now exists");
        System.out.println(thief2 + " now exists");
    }
}