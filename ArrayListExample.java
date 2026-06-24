import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample 
{ 
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(21);
        // list.add(27);
        // list.add(4);
        // list.add(7);
        // list.add(5);

        // System.out.println(list.contains(27));
        // list.set(0,2);
        // list.remove(4);

        // System.out.println(list);
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            list.add(in.nextInt());
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }
        in.close();
    }
    
}
