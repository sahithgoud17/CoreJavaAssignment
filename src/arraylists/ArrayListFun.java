package arraylists;
import java.util.*;
public class ArrayListFun
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<>();
        System.out.println("Enter the number of fruits ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String f = sc.next();
            fruits.add(f);
        }
        for(int i=0;i<fruits.size();i++)
        {
            System.out.print(fruits.get(i) + " ");
        }
    }
}
