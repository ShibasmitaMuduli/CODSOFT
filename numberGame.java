import java.util.Random;
import java.util.Scanner;

public class numberGame
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Random rndm = new Random();
        int computerNo = rndm.nextInt(101);

        int count = 0;

        do{
            System.out.println("Guess the number: ");
            int userNo = scan.nextInt();
            count++;
            if(computerNo == userNo)
            {
                System.out.println("Correct Guess. You have guessed the number in "+count+" attempts");
                break;
            }
            else if(computerNo > userNo)
            {
                System.out.println("Incorrect Guess. The guessed number is too low");
            }
            else
            {
                System.out.println("Incorrect Guess. The guessed number is too high");
            }
        }while(count<=10);
        scan.close();
    }
}