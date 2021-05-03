import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private boolean stillWantsToPlay = true;
    Scanner scanner = new Scanner(System.in);


    public void chooseGame(){
        while (stillWantsToPlay){
            System.out.println("Do you want to play a Game? Y/N");
            String answer = scanner.next();
            scanner.nextLine();
            if (answer.toLowerCase(Locale.ROOT).contains("n")){
                stillWantsToPlay =false;
                break;
            }
            System.out.println("Which Game do you want to play? Pick a number\n 1.Guessing Game\n2.HardCore Guessing Game");

            answer = scanner.next();

            switch (answer) {
                case "1":playGuessingGame();break;
                case "2":playHardCoreGuessingGame();break;
                default:stillWantsToPlay=false;

            }

        }

    }

    public void playGuessingGame(){
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;
        System.out.println("guess a number fro 1 to 10");
        int yourNumber;

        do {
            yourNumber = scanner.nextInt();
            if (yourNumber==randomNumber)
                System.out.println("Congrats");
            else
                System.out.println("Try again");
        }while (yourNumber!=randomNumber);
        chooseGame();



    }

    public void playHardCoreGuessingGame(){

        System.out.println("Sorry this game is not available yet");
        chooseGame();

    }
}
