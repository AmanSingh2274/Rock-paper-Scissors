import java.util.Random; 
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        while (true) {
            System.out.println("Enter move (Rock, Paper, Scissors). To exit the game, type \"exit\":");
            String userMove = scanner.nextLine();
            
            if (userMove.equalsIgnoreCase("exit")) {
                System.out.println("Game over. Thanks for playing!");
                break;
            }
            
            if (!isValidMove(userMove, choices)) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }
            
            String computerMove = choices[random.nextInt(choices.length)];
            System.out.println("Computer move: " + computerMove);
            
            String result = determineWinner(userMove, computerMove);
            System.out.println(result);
        }
        
        scanner.close();
    }

    private static boolean isValidMove(String move, String[] choices) {
        for (String choice : choices) {
            if (choice.equalsIgnoreCase(move)) {
                return true;
            }
        }
        return false;
    }

    private static String determineWinner(String userMove, String computerMove) {
        if (userMove.equalsIgnoreCase(computerMove)) {
            return "It's a tie!";
        }

        switch (userMove.toLowerCase()) {
            case "rock":
                return computerMove.equalsIgnoreCase("Scissors") ? "You win!" : "Computer wins!";
            case "paper":
                return computerMove.equalsIgnoreCase("Rock") ? "You win!" : "Computer wins!";
            case "scissors":
                return computerMove.equalsIgnoreCase("Paper") ? "You win!" : "Computer wins!";
            default:
                return "Error in determining winner.";
        }
    }
}
