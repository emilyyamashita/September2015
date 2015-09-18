
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
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|"); //This line is only repeated once, so I am not creating a method call
        for (int line = 1; line <= 4; line++) //The line number only represents which line it is in this loop
        {
            for (int i = 1; i <= line; i++) //The line it is tells us exactly how many spaces are in the line
            {
                System.out.print(" ");
            }
            System.out.print("\\"); 
            for (int j = 1; j <= 10 - 2 * line; j++) //There are two less colons as each line progresses, starting with eight colons
            {
                System.out.print(":");
            }
            System.out.println("/");
        }
        System.out.println("     ||");
        for (int line = 1; line <=  4; line++) //This is a new loop, with the line representing which line it is in this loop
        {
            for (int i = 1; i <= 5 - line; i++) //The number of spaces decreases my one each line, starting with four spaces
            {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 1; j <= 2 * line; j++) //The number of colons is two * # of lines
            {
                System.out.print(":");
            }
            System.out.println("\\");
        }
        System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
    }
}