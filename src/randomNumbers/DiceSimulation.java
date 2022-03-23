package randomNumbers;
import java.util.*;
public class DiceSimulation
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int diceVal;
        for(int i=0;i<10;i++)
        {
            diceVal = r.nextInt(6) + 1;
            System.out.println(diceVal);
        }

    }
}
