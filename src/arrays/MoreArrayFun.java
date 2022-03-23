package arrays;

public class MoreArrayFun
{
    public static void main(String[] args)
    {
        int[] a = new int[11];
        for(int i=0;i<a.length;i++)
        {
            a[i] = i;
        }
        for(int x : a)
            System.out.print(x + " ");
    }
}
