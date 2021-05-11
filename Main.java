
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to \"Match The Number\" Game");
        Scanner sc = new Scanner(System.in);
        System.out.println("Sir, What is your name: ");
        String name = sc.next();
        System.out.println("Hello " + name);
        System.out.println();
        Thread.sleep(2000);
        System.out.println("In this you have to guess a number if it match with the computer number you will win the game, You have 4 turns be ready.");
        Thread.sleep(12000);
        System.out.println("Can we start the game? ");
        int c = 0, c1 = 0;
        while(c != 1) {
            String Answer = sc.next();
            if(Answer.equals("yes") || Answer.equals("Yes")) {
                c = 1;
                Random r = new Random();
                int num = r.nextInt(21);
                System.out.println("Guess a number between 0 to 20 sir: ");
                while (c1 != 5) {
                    int snum = sc.nextInt();
                    c1++;
                    if (snum == num) {
                        System.out.println("Congratulation Sir You Win The Game");
                        break;
                    } else {
                        System.out.println("Your guess number is wrong.");
                        if (snum > num) {
                            System.out.println("Guess a lower number");
                        } else {
                            System.out.println("Guess a higher number");
                        }
                    }
                }
            } else if (Answer.equalsIgnoreCase("yes")){
                System.out.println("Can we start it now?");
            }
        }
    }
}