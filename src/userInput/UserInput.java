package userInput;
import java.util.*;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is Your age?");
        int age = sc.nextInt();
        System.out.println("What is your real number ? ");
        int num = sc.nextInt();
        num = (2*num);
        System.out.println("What is your city?");
        String city = sc.next();
        System.out.println("Name is " + name);
        System.out.println("Age is " + age );
        System.out.println("Real number = " + num);
        System.out.println("City is " + city);
    }
}
