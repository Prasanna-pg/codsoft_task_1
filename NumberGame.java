package Codsoft_internship_projects.codsoft_task_1;
import java.util.*;
public class NumberGame {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int chances=8,finals=0;
        boolean playAgain=true;
        System.out.println("Welcome to the Number Game.....!");
        System.out.println("Hey Buddy you have about "+chances+" chances to win the game");
        while(playAgain){
            int randomNumber=getRandomNumber(1,100);
            boolean guess=false;
            for(int i=1;i<=chances;i++){
                System.out.println("Chance->"+i+" Enter your guess");
                int userNumber=sc.nextInt();
                if(userNumber==randomNumber){
                    guess=true;
                    finals+=1;
                    System.out.println("Congratulations! You Won it...!");
                    break;
                }
                else if(userNumber>randomNumber){
                    System.out.println("Too High...");
                }
                else{
                    System.out.println("Too Low...");
                }
            }
            if(!guess){
                System.out.println("Sorry Buddy. You lost the chances. The randomNumber is "+randomNumber);
            }
            System.out.print("Do you want to play Again (Yes/No)");
            String pa=sc.next();
            playAgain=pa.equalsIgnoreCase("Yes");
        }
        System.out.println("That's it Buddy, Hope you enjoyed it");
        System.out.print("Here is your Score "+finals);
    }
    public static int getRandomNumber(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
}
