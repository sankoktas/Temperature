/** Finds out whether the water is liquid, solid, or gas. 
 * @author (Fikri Şan Köktaş)
 * @version (14 December 2020)*/
import java.util.Scanner;
public class KFS_Temperataure_Main
{
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please choose the unit. You can either choose C or F. ");
        String unit = input1.nextLine();
         
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int x = input2.nextInt();
        if (unit.equals("C"))
        {
            if (x <= 0 ) 
            {
                System.out.println("Solid");
            }
            else if ( x >= 100 ) 
            {
                System.out.println("Gas");
            }
            else 
            {
                System.out.println("Liquid");
            }
        }
        if (unit.equals("F"))
        {
            if (x <= 32 ) 
            {
                System.out.println("Solid");
            }
            else if ( x >= 212 ) 
            {
                System.out.println("Gas");
            }
            else 
            {
                System.out.println("Liquid");
            }
        }
    }
}
