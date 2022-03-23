package controlStatement;
import java.util.*;
public class Fraternity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Gender :");
        char g = sc.next().charAt(0);

        if(g=='M'||g=='m')
        {
            System.out.println("Enter the Age");
            int age = sc.nextInt();
            if(age>=19)
                System.out.println("Your are eligible");
            else
                System.out.println("not eligible for your age");
        }
        else
            System.out.println("Only Males are allowed");
    }
}
