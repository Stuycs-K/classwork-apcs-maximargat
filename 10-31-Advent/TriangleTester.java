import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester
{
    public static void main(String[] args)
    {
        //System.out.println(test(10, 12, 14)); // good
        //System.out.println(test(10, 30, 14)); // impossible

        System.out.println("CountTris (A): "+ countTrianglesA("inputTri.txt"));
        //System.out.println("CountTris (B): " + countTrianglesB("inputTri.txt")); // should be 6 for the short one
    }
    public static int countTrianglesA(String filename)
    {
        try
        {
            Scanner sc = new Scanner(new File(filename));
            int countvalid = 0;
            while(sc.hasNextLine())
            {
                //if(test(sc.nextInt(), sc.nextInt(), sc.nextInt()))
                //    countvalid++;
                String str = sc.nextLine();
                String[] splitted = str.split("  ");
                int[] actualstuff = new int[3];
                for(int i = 1; i < splitted.length; i++)
                {
                    actualstuff[i - 1] = Integer.parseInt(splitted[i]);
                }
                if(test(actualstuff[0], actualstuff[1], actualstuff[2]))
                    countvalid++;
            }
            return countvalid;
        }
        catch(FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
            return -999;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return -999;
        }
    }

    public static int countTrianglesB(String filename)
    {
        try
        {
            Scanner sc = new Scanner(new File(filename));
            int countvalid = 0;
            while(sc.hasNextLine())
            {
                int[] row1 = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
                int[] row2 = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
                int[] row3 = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};

                for(int i = 0; i < 3; i++)
                {
                    if(test(row1[i], row2[i], row3[i]))
                        countvalid++;
                }
            }
            return countvalid;
        }
        catch(Exception e)
        {
            System.out.println("File not found");
            return -999;
        }
    }

    public static boolean test(int sidea, int sideb, int sidec)
    {
        return (sidea + sideb > sidec) && (sidea + sidec > sideb) && (sideb + sidec > sidea);
    }
}