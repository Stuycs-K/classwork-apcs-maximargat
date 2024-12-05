public class Driver
{
    public static void main(String[] args)
    {
        // my terminal is white background so i'm doing this
        hborder();
        numbers();
        divider();
        // 26 lines left
        hborder();
    }

    public static void hborder()
    {
        String allequals = ""; // 78 '=' in a row
        for(int i = 0; i < 39; i++)
        { allequals += "=="; }

        Text.color(Text.BLUE + 60, 46);
        System.out.print("X");
        Text.color(Text.YELLOW + 60, 46);
        System.out.print(allequals);
        Text.color(Text.BLUE + 60, 46);
        System.out.print("X");
        System.out.print(Text.RESET);
        System.out.print("\n");
    }

    public static void numbers()
    {
        Text.color(Text.YELLOW + 60, 46);
        System.out.print("|");

        for(int i = 0; i < 78; i++)
        {
            if(i == 20 | i == 40 | i == 60)
            {
                int no = (int)(Math.random() * 100);
                String printy = "" + no;
                if(no > 75)
                {
                    Text.color(Text.WHITE + 70, Text.GREEN + 60);
                }
                else if(no < 25)
                {
                    Text.color(Text.WHITE + 70, Text.RED + 60);
                }
                else
                {
                    Text.color(Text.WHITE + 70, 30);
                }
                System.out.print(printy);
                if(printy.length() == 2)
                    i++;
            }
            else
            {
                Text.color(Text.WHITE + 70, 30);
                System.out.print(" ");
            }
        }
        



        Text.color(Text.YELLOW + 60, 46);
        System.out.print("|");
        System.out.print(Text.RESET);
        System.out.print("\n");
    }

    public static void divider()
    {
        String dashes = ""; // 78 '=' in a row
        for(int i = 0; i < 39; i++)
        { dashes += "- "; }

        Text.color(Text.YELLOW + 60, 46);
        System.out.print("|");
        Text.color(Text.WHITE + 70, 30);
        System.out.print(dashes);
        Text.color(Text.YELLOW + 60, 46);
        System.out.print("|");
        System.out.print(Text.RESET);
        System.out.print("\n");
    }

    public static void printMidLine()
    {

        System.out.print("\n");
    }
}