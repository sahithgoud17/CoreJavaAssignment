package arraylists;
import java.util.*;
public class Proj_Arraylists
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter the elements into the lsit: ");
        while(i>=0)
        {
            int n = sc.nextInt();
            list.add(n);
            i = n;
        }
        System.out.println("you should not enter a negative number: ");
        System.out.println("Elements in the arraylist are : ");
        for(int j=0;j<list.size()-1;j++)
        {
            System.out.println(list.get(j));
        }
    }
}
