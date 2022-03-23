package stringbuilder;

import java.util.Locale;
import java.util.Scanner;

public class NameParser
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;
        System.out.println("Enter your full name ");
        fullName = sc.nextLine();
        int indexOfSpace = fullName.indexOf(" ");
        firstName = fullName.substring(0 , indexOfSpace);
        lastName = fullName.substring(indexOfSpace + 1);

        firstName = firstName.toUpperCase(Locale.ROOT);
        lastName = lastName.toLowerCase(Locale.ROOT);

        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);

    }

}
