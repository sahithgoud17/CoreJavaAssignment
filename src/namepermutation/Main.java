package namepermutation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> lastName = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of names");
        int number = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i<number;i++)
        {
            System.out.println("please enter full name" + i);
            String fullName = scanner.nextLine();
            int index = fullName.indexOf(" ");
            firstName.add(fullName.substring(0,index));
            lastName.add(fullName.substring(index+1));
        }
        System.out.println("All possible permutations: ");
        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)
            {
                System.out.println(firstName.get(i) + " " + lastName.get(j));
            }
        }
    }
}
