public class Fib
{
    // fib(47): 6.43s, fib(48) is >10s, fib(46) is the last before overflow
    public static void main(String[] args)
    {
        //int num = Integer.parseInt(args[0]);
        //System.out.println("Fib of " + num + ": " + fib(num));
        makeWords(3, "", "abcd");
    }
    public static int fib(int n)
    {
        if(n < 2)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static void makeWords(int remainingLetters, String result, String alphabet)
    {
        if(remainingLetters == 0)
            System.out.println(result);
        else
        {
            for(int i = 0; i < alphabet.length(); i++)
            {
                makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet);
            }
        }
    }

}