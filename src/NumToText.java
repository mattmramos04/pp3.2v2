import java.util.Scanner;

public class NumToText
{
    public static void main (String[] args)
    {
        int num1;
        Scanner numToText;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input a single digit");
        num1 = keyboard.nextInt();

        //if statement that stores all of the specific words for each number
        if (num1 == 0)
        {
            System.out.println(numToText("Zero"));
        }
        else if (num1 == 1)
        {
            System.out.println(numToText("One"));
        }
        else if (num1 == 2)
        {
            System.out.println(numToText("Two"));
        }
        else if (num1 == 3)
        {
            System.out.println(numToText("Three"));
        }
        else if (num1 == 4)
        {
            System.out.println(numToText("Four"));
        }
        else if (num1 == 5)
        {
            System.out.println(numToText("Five"));
        }
        else if (num1 == 6)
        {
            System.out.println(numToText("Six"));
        }
        else if (num1 == 7)
        {
            System.out.println(numToText("Seven"));
        }
        else if (num1 == 8)
        {
            System.out.println(numToText("Eight"));
        }
        else if (num1 == 9)
        {
            System.out.println(numToText("Nine"));
        }
    }
    public static String numToText(String input)
    {
        return input;
    }
}