package controlStatement;
import java.util.*;
public class SumFun
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner((System.in));
        System.out.println("Enter the number of elements ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("enter the elements ");
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            if(num<0)
                break;
            else
                sum = sum + num;
        }
        System.out.println("The total sum is " + sum);
    }
}
