import java.util.Scanner;

public class wordCounter
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a string: ");
        str = sc.nextLine();

        int words = 1;
        for(int i=0;i<str.length()-1;i++)
        {
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
            {
                words++;
            }
        }
        System.out.println("The number of words in the string is "+words);
        sc.close();
    }
}