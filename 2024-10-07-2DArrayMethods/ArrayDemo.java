import java.util.Arrays;
public class ArrayDemo{
    public static void main(String[]args){
    //write your tests here!
        int[][] testarray = {{1,0,-3,6}, {0}, {}, {4,-4,4,4,-4,4,4,4,-4,4}, {0, -6, 4, 3, 1}};
        System.out.println(arrToString(testarray));
        System.out.println("countzeros2d() test");
        System.out.println(countZeros2D(testarray)); // expected: 3
        System.out.println("arr2dsum() test");
        System.out.println(arr2DSum(testarray)); // expected: 22

        System.out.println("replaceNegative() test");
        testarray = new int[][]{{1,0,-3,6}, {0}, {}, {4,-4,4,-4,-4,4,4,4,-4,4}, {0, -6, 4, 3, 1}};
        replaceNegative(testarray);  // should replace -3 with 0, -4 no. 1, 3, and 4 with 0,
        System.out.println(arrToString(testarray)); // -4 no. 2 with 1, and -6 with 0

        System.out.println("copy() test");

        String beforerunning = arrToString(testarray);
        String beforerunningmemadress = "" + testarray;
        int[][] copied = copy(testarray);
        System.out.println("Copied!");
        System.out.println("Same address?: " + beforerunningmemadress.equals("" + copied)); // should be false
        System.out.println("Same content?: " + beforerunning.equals(arrToString(copied))); // should be true

        System.out.println("swapRC() test");

        testarray = new int[][]{{1, 5, 3}, {0, 8, 5}, {3, 5, 4}, {0, 5, 6}};
        System.out.println(arrToString(testarray));
        System.out.println(arrToString(swapRC(testarray)));
    }

    public static String arrToString(int[] array)
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

    public static String arrToString(int[][] array)
    {
        String s = "[";
        for(int i = 0; i < array.length; i++)
        {
            s += arrToString(array[i]) + ", ";
        }
        if(array.length > 0)
            return s.substring(0, s.length() - 2) + "]";
        return s + "]";
    }

    //1. Calculate and return how many elements equal zero in the 2D array.
    public static int countZeros2D(int[][] nums){
        int count = 0;
        for(int y = 0; y < nums.length; y++)
        {
            for(int x = 0; x < nums[y].length; x++)
            {
                if(nums[y][x] == 0)
                    count++;
            }
        }
        return count;
    }

    //2. Calculate the sum of a 2d array
    /*Return the sum of all of the values in the 2D array
    *Use a nested loop instead of a helper method*/
    public static int arr2DSum(int[][] array)
    {
        int sum = 0;
        for(int y = 0; y < array.length; y++)
        {
            for(int x = 0; x < array[y].length; x++)
            {
                sum += array[y][x];
            }
        }
        return sum;
    }

    //3. Modify a given 2D array of integer as follows:
    //Replace all the negative values:
    //-When the row number is the same as the column number replace
    //that negative with the value 1
    //-All other negatives replace with 0
    public static void replaceNegative(int[][] nums){
        for(int y = 0; y < nums.length; y++)
        {
            for(int x = 0; x < nums[y].length; x++)
            {
                if(nums[y][x] < 0)
                {
                    nums[y][x] = (x == y) ? 1 : 0;
                }
            }
        }
    }

    //4. Make a copy of the given 2d array.
    //When testing : make sure that changing the original does NOT change the copy.
    //DO NOT use any built in methods that "copy" an array.
    //You SHOULD write a helper method for this.
    //If you don't see a good way to do that, you should stop and look at prior methods.
    public static int[][] copy(int[][] nums)
    {
        int[][] result = new int[nums.length][];
        for(int y = 0; y < nums.length; y++)
        {
            result[y] = new int[nums[y].length];
            for(int x = 0; x < nums[y].length; x++)
            {
                result[y][x] = nums[y][x];
            }
        }
        return result;
    }

    //5. Rotate an array by returning a new array with the rows and columns swapped.
    //   You may assume the array is rectangular and neither rows nor cols is 0.
    //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    public static int[][] swapRC(int[][]nums)
    {
        int newcolsamt = nums.length;
        int newrowsamt = nums[0].length; // can be done because rectangular, so length of any index is the same

        int[][] result = new int[newrowsamt][newcolsamt];

        for(int row = 0; row < newrowsamt; row++)
        {
            for(int col = 0; col < newcolsamt; col++)
            {
                result[row][col] = nums[col][row];
            }
        }

        return result;

        
    }

    //6. Make an HTML table by putting a table tag around the entire 2d array,
    //   tr tags around each row, and td tags around each value.
    //   You may use a helper method
    //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
    //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
    // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
    public static String htmlTable(int[][]nums){
        return "";
    }
}