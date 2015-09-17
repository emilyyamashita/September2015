
/**
 * Print the hourglass figure using nested loops
 * 
 * @author Emily Yamashita
 * @version v1 09/16/2015
 */
public class Hourglass
{
    public static void main(String[] args)
    {
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
        for (int h = 1; h <= 4; h++)
        {
            for (int i = 1; i <= h; i++)
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int j = 1; j <= -2*h + 10; j++);
            {
                System.out.print(":");
            }
            System.out.println("/");
        }
        System.out.println("     ||");
    }
}