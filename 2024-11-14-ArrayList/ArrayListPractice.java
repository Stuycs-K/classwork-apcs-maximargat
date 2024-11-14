import java.util.ArrayList;

// Maxim Argat and Axel Stahl
public class ArrayListPractice
{
    public static void main(String[] args)
    {
        ArrayList<String> testarr1 = createRandomArray(10);
        replaceEmpty(testarr1);
        System.out.println(testarr1);
    }
    
    public static ArrayList<String>createRandomArray(int size)
    {
        ArrayList<String> al = new ArrayList<String>();

        for(int i = 0; i < size; i++)
        {
            int thing = (int)(Math.random() * 11);
            if(thing == 0)
            {
                al.add("");
            }
            else
            {
                al.add("" + thing);
            }
        }

        return al;
    }

    public static void replaceEmpty(ArrayList<String> original)
    {
        for (int i = 0; i < original.size(); i++) {
            if (original.get(i).equals("")) {
                original.set(i, "Empty");
            }
        }
    } 

    public static ArrayList<String> makeReversedList(ArrayList<String> original)
    {
        //return a new ArrayList that is in the reversed order of the original.
        return createRandomArray(1);
    } 

    public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b)
    {
        //return a new ArrayList that has all values of a and b in alternating order that is:
        //a[0], b[0], a[1], b[1]...
        //If one list is longer than the other, just attach the remaining values to the end.
        return createRandomArray(1);
    } 
}