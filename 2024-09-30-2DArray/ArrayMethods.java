public class ArrayMethods
{
    // Maxim Argat (maxima5) and Ardian Agoes (ardiana)

    public static void main(String[] args)
    {
        int[][] array1 = new int[][]{{2, 7, 9}, {3, 6, 1}, {7, 4, 2}}; // sum should be 41
        System.out.println(arrayToString(array1));

        System.out.println(arr2DSum(array1));
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

    public static int arr2DSum(int[][] array)
    {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            int[] subarray = array[i];
            for(int j = 0; j < subarray.length; j++)
            {
                sum += subarray[j];
            }
        }
        return sum;
    }
}