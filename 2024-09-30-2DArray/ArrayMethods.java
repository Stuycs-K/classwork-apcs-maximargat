public class ArrayMethods
{
    // Maxim Argat (maxima5) and Ardian Agoes (ardiana)

    public static void main(String[] args)
    {
        int[][] array1 = new int[3][4];
        System.out.println(arrayToString(array1));
    }

    public static String arrayToString(int[] array)
    {
        String s = "[";
        for(int i = 0; i < array.length; i++)
        {
            s += array[i] + ", ";
        }
        if(array.length > 0)
            return s.substring(0, s.length() - 2) + "]";
        return s + "]";
    }

    public static String arrayToString(int[][] array)
    {
        String s = "[";
        for(int i = 0; i < array.length; i++)
        {
            s += arrayToString(array[i]) + ", ";
        }
        if(array.length > 0)
            return s.substring(0, s.length() - 2) + "]";
        return s + "]";
    }
}