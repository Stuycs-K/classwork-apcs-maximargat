public class Driver
{
    public static void main(String[] args)
    {
        Thief thief1 = new Thief("Joe");
        Thief thief2 = new Thief("Bobert", 15);

        System.out.println(info(thief1) + "\n" + info(thief2));
        // constructors work

        System.out.println(thief1.attack(thief2));
        System.out.println(info(thief1) + "\n" + info(thief2));

        System.out.println(thief2.support());
        System.out.println(thief2.support());

        // healing doesn't go over max HP, good
        System.out.println(thief2.support(thief1));
        System.out.println(info(thief1) + "\n" + info(thief2));
        System.out.println(thief1.attack(thief2));
        System.out.println(thief1.support());


        System.out.println(thief1.specialAttack(thief2));
        System.out.println(info(thief1) + "\n" + info(thief2));
        System.out.println(thief1.specialAttack(thief2));
        System.out.println(info(thief1) + "\n" + info(thief2));
        System.out.println(thief1.specialAttack(thief2));
        System.out.println(info(thief1) + "\n" + info(thief2));
    }

    public static String info(Adventurer guy)
    {
        return guy.getName() + ":  HP = " + guy.getHP() + ", Special = " + guy.getSpecial();
    }
}