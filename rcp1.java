
import java.util.Random;   // Importing the random class of util package
import java.util.Scanner;  // Importing the scanner class of util package

public class rcp1 {
    public static void main(String[] args) {

        System.out.println(" --//\t WELCOME TO THE GAME OF ROCK , PAPER AND SCISSOR //--");

        Scanner sc = new Scanner(System.in);
        System.out.print("\n (0). ROCK  \n (1). PAPER  \n (2). SCISSOR  ");
        
        // Getting Player Choice

        System.out.print("\n \nEnter the index no. you want choose : ");
        int playerValue = sc.nextInt();

        // Getting Computer Choice

        Random random = new Random();
        int computerValue = random.nextInt(3);

        // Displaying computer's choice 

        if(computerValue==0){
            System.out.println(" \nComputer Choses : 'ROCK' ");
        }
        
        else if(computerValue==1){
            System.out.println(" \nComputer Chooses : 'PAPER' ");
        }
        
        else if(computerValue==2){
            System.out.println(" \nComputer Chooses : 'SCISSOR' ");
        }


        // Condition of the game

        if (playerValue == computerValue) {
            System.out.println(" \n-- GAME IS DRAW --");
        }
        
        else if (playerValue == 0 && computerValue == 2 || playerValue == 1 && computerValue == 0
                || playerValue == 2 && computerValue == 1) {
            
            System.out.println(" \n--HURRAY ! YOU WON THE GAME-- ");
        } 
        
        else {
            System.out.println(" \n--OOPS ! YOU LOSE THE GAME-- ");
        }

        System.out.print("\n--%/ I HOPE YOU ENJOYED THE GAME /%--");
    
    }
}
 
    

