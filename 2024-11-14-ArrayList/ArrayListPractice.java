import java.util.ArrayList;

// Maxim Argat and Axel Stahl
public class ArrayListPractice
{
    public static void main(String[] args)
    {
        ArrayList<String> testarr1 = createRandomArray(7);
        replaceEmpty(testarr1);
        System.out.println(testarr1);
        ArrayList<String> testarr2 = createRandomArray(10);
        replaceEmpty(testarr2);
        System.out.println(testarr2);
        //System.out.println(makeReversedList(testarr1));

        System.out.println(mixLists(testarr1, testarr2));
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
        ArrayList<String> res = new ArrayList<String>();
        for (int i = original.size()-1; i>=0; i--) {
            res.add(original.get(i));
        }
        return res;
    } 

    public static ArrayList<String> mixLists(ArrayList<String> a, ArrayList<String> b)
    {
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 0; i < Math.max(a.size(), b.size()); i++)
        {
            if(i < a.size())
                res.add(a.get(i));
            if(i < b.size())
                res.add(b.get(i));
        }
        return res;
    } 
}