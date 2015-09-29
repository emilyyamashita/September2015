
/**
 * Create a program that prints Christmas Trees using two parameters for segments and height
 * 
 * @author Emily Yamashita
 * @version v1 09/28/2015
 */
public class ChristmasTreesEmily
{
    public static void main(String[] args)
    {
        int segments = 6; //segments represents how many "triangles" are in the tree
        int height = 4; //height represents how many rows are in each "triangle"
        drawChristmasTree(segments, height);
    }
    public static void drawChristmasTree(int segments, int height)
    {
        for (int triangle = 1; triangle <= segments; triangle++)
        {
            for (int line = 1; line <= height; line++)
            {
                for (int spaces = 1; spaces <= segments + height - line - triangle; spaces++)
                /*the number of spaces decreases by one each line
                 * there is one less space for each relative line for each additional triangle
                 */
                {
                    System.out.print(" ");
                }
                for (int asterisks = 1; asterisks <= 2 * triangle + 2 * line - 3; asterisks++)
                /*the number of asterisks increases by two each line, and starts with two additional
                 * at the start of each new triangle compared to the relative line in the previous 
                 * triangle, starting with one in the first line
                 */
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (int spaces = 1; spaces <= (2 * segments + 2 * height - 4)/ 2; spaces++)
        /*the number of spaces in the narrow part of the stem is half of the number of asterisks 
         * in the last line, which will always be odd
         */
            {
                System.out.print(" ");
            }
        System.out.println("*");
        //the previous for loop and println statement is repeated in the stem
        for (int spaces = 1; spaces <= (2 * segments + 2 * height -4) / 2; spaces++)
            {
                System.out.print(" ");
            }
        System.out.println("*");
        System.out.print(" ");
        for (int asterisks = 1; asterisks <= 2 * segments + 2 * height - 5; asterisks++)
        /*the number of asterisks in the base will always be 2 less than the number of asterisks 
          the last line in the tree, which is the longest line in the tree
         */
            {
                System.out.print("*");
            }
        }
    }

                