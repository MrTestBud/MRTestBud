import java.util.Random;
import java.util.Scanner;

public class Rock_paper_Sccisor_game_ {
    public static void main(String[] args) {
       while (true){     
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Choose \n 0.Rock \n 1.Paper \n 2.Scissor");
            int a = scan.nextInt();
            switch (a){
                case 0 -> System.out.println("You Have Chosen Rock");
                case 1 -> System.out.println("You Have Chosen Paper");
                case 2 -> System.out.println("You Have Chosen Scissor");
            }
            Random r = new Random();
            int c = r.nextInt(3);
            switch (c) {
                case 0 -> System.out.println("Computer Have Chosen Rock");
                case 1 -> System.out.println("Computer Have Chosen Paper");
                case 2 -> System.out.println("Computer Have Chosen Scissor");
            }
            if (a==0 && c==1 || a==1 && c==2 || a==2 && c==0){
                System.out.println("You lost, Try Again !!");
            }else if (c==0 && a==1 || c==1 && a==2 || c==2 && a==0){
                System.out.println("You Won, Play Again ? ");
            } else if (a==c) {
                System.out.println("You Tied, Try Again !!");
    
            }
       }
    }
}
