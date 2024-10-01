public class ArrayMethods
{
    // Maxim Argat (maxima5) and Ardian Agoes (ardiana)

    public static void main(String[] args)
    {
        int[][] array1 = new int[][]{{2, 7, 9, 0}, {3, 6, 1, 0}, {7, 4, 2, 0}}; // sum should be 41
        System.out.println(arrayToString(array1));

        System.out.println(arr2DSum(array1));

        System.out.println(arrayToString(swapRC(array1)));

        int[][] boxarray = new int[][]{{8, 8, 8, 8, 8}, {8, 0, 0, 0, 8}, {8, 0, 0, 0, 8}, {8, 8, 8, 8, 8}};
        System.out.println(arrayToString(swapRC(boxarray)));

        int[][] raggedarray = new int[][]{{4, 4, 4, 4}, {2, 2}, {1}, {3, 3, 3}};
        // System.out.println(arrayToString(swapRC(raggedarray))); causes exception
        int[][] emptyarray = new int[][]{};
        // System.out.println(arrayToString(swapRC(raggedarray))); causes exception
        int[][] stickarray = new int[][]{{1}, {2}, {3}, {4}, {5}, {6}, {7}};
        System.out.println(arrayToString(swapRC(stickarray)));
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
    public static int[][] swapRC(int[][] nums)
    {
        int arr1Length = nums[0].length;
        int arr2Length = nums.length;
        int [][] returnArray = new int[arr1Length][arr2Length];

        for(int y = 0; y < arr1Length; y++)
        {
            for(int x = 0; x < arr2Length; x++)
            {
                int thing = nums[x][y]; // splitting the statement to see where index error is
                returnArray[y][x] = thing;
            }
        }
        return returnArray;
    }
}