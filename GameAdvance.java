import java.util.Scanner;

class Gusser {
    int guessNum;

    public int GusserNumber(Scanner sc) {
        System.out.print("Provide Gusser Number: ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;

    public int PlayerNumber(Scanner sc, int playerNo) {
        System.out.print("Provide Player " + playerNo + " Number: ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Empire {

    int GusserProvided;
    int P1, P2, P3;

    public void collectNumbers(Scanner sc) {

        Gusser g = new Gusser();
        GusserProvided = g.GusserNumber(sc);

        Player p1 = new Player();
        P1 = p1.PlayerNumber(sc, 1);

        Player p2 = new Player();
        P2 = p2.PlayerNumber(sc, 2);

        Player p3 = new Player();
        P3 = p3.PlayerNumber(sc, 3);
    }

    public void compare() {

        if (GusserProvided == P1) {

            if (GusserProvided == P2 && GusserProvided == P3) {
                System.out.println("All Players Won the Game");
            }
            else if (GusserProvided == P2) {
                System.out.println("Player 1 and Player 2 Won the Game");
            }
            else if (GusserProvided == P3) {
                System.out.println("Player 1 and Player 3 Won the Game");
            }
            else {
                System.out.println("Player 1 Won the Game");
            }

        }
        else if (GusserProvided == P2) {

            if (GusserProvided == P3) {
                System.out.println("Player 2 and Player 3 Won the Game");
            }
            else {
                System.out.println("Player 2 Won the Game");
            }

        }
        else if (GusserProvided == P3) {
            System.out.println("Player 3 Won the Game");
        }
        else {
            System.out.println("All Players Lost the Game");
        }
    }
}

public class GameAdvance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            System.out.println("\n===== GUESSING GAME =====");

            Empire e = new Empire();

            e.collectNumbers(sc);

            System.out.println();

            e.compare();

            System.out.print("\nDo you want to play again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank You for Playing!");

        sc.close();
    }
} 

