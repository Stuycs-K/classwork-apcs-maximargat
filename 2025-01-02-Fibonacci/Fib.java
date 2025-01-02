public class Fib
{
    // fib(47): 6.43s, fib(48) is >10s, fib(46) is the last before overflow
    public static void main(String[] args)
    {
        int num = Integer.parseInt(args[0]);
        System.out.println("Fib of " + num + ": " + fib(num));
    }
    public static int fib(int n)
    {
        if(n < 2)
            return n;
        return fib(n-1) + fib(n-2);
    }
}