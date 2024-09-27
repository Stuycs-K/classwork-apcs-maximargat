public class MyArrays
{
    public static void main(String[] args)
    {
        System.out.println("returnCopy(): ");

        int[] tobecopied = {2, 5, 1, 5, 5, 9};
        System.out.println(arrayToString(tobecopied));
        System.out.println(arrayToString(returnCopy(tobecopied)));
        System.out.println("Same addresses?: " + (tobecopied == returnCopy(tobecopied)));

        System.out.println("concatArray(): ");

        int[] arr1 = {2, 5, 1, 5, 5, 9};
        int[] arr2 = {7, 4, 7, 4};
        System.out.println(arrayToString(arr1));
        System.out.println(arrayToString(arr2));
        System.out.println(arrayToString(concatArray(arr1, arr2)));
    }
    public static int[] returnCopy(int[] nums)
    {
        int[] array = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            array[i] = nums[i];
        }
        return array;
    }
    public static int[] concatArray(int[] arr1, int[] arr2)
    {
        int[] result = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length; i++)
        {
            result[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++)
        {
            result[i + arr1.length] = arr2[i];
        }

        return result;
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
}