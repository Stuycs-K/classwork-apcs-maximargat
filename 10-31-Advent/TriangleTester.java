import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester
{
    public static void main(String[] args)
    {
        //System.out.println(test(10, 12, 14)); // good
        //System.out.println(test(10, 30, 14)); // impossible

        System.out.println(countTrianglesA("inputTri.txt"));
    }
    public static int countTrianglesA(String filename)
    {
        try
        {
            Scanner sc = new Scanner(new File(filename));
            int countvalid = 0;
            while(sc.hasNextLine())
            {
                if(test(sc.nextInt(), sc.nextInt(), sc.nextInt()))
                    countvalid++;
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