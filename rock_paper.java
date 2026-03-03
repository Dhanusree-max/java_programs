import java.util.*;

public class rock_paper {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String player1 = sc.next();
        String player2 = sc.next();
        if ((player1.equals("rock") && player2.equals("scissor")) ||
                (player1.equals("paper") && player2.equals("rock")) ||
                (player1.equals("scissor") && player2.equals("paper"))) {
            System.out.println("Player 1 Wins");
        } else if ((player2.equals("rock") && player1.equals("scissor")) ||
                (player2.equals("paper") && player1.equals("rock")) ||
                (player2.equals("scissor") && player1.equals("paper"))) {
            System.out.println("Player 2 Wins");
        } else {
            System.out.println("Draw");
        }
    }
}
