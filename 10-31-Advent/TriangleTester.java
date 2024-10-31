public class TriangleTester
{
    public static void main(String[] args)
    {
        System.out.println(test(10, 12, 14)); // good
        System.out.println(test(10, 30, 14)); // impossible
    }

    public static boolean test(int sidea, int sideb, int sidec)
    {
        return (sidea + sideb > sidec) && (sidea + sidec > sideb) && (sideb + sidec > sidea);
    }
}