
import java.util.*;
import java.util.Scanner;
class Gusser{
    int guessNum;
    public int GusserNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide Gusser NUmber");
        guessNum = sc.nextInt();
        return guessNum;

    }
}


class Player{
    int guessNum;
    public int PlayerNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide Player NUmber");
        guessNum =sc.nextInt();
        return guessNum;
    }

}
class Empire{
     Gusser g = new Gusser();
     int GusserProvided = g.GusserNumber();
     Player p1= new Player();
     int P1 = p1.PlayerNumber();
     Player p2= new Player();
     int P2 = p2.PlayerNumber();
     Player p3= new Player();
     int P3 = p3.PlayerNumber();

     public void compare(){

        if(GusserProvided==P1){
            if(GusserProvided==P2 && GusserProvided==P3){
                System.out.println("All Players Won the Game");}
                else if(GusserProvided==P2){
                    System.out.println("Player 1 and Player 2 won the game");
                }
                else if(GusserProvided==P3){
                    System.out.println("Player 1 and Player 3 Won The game");
                }
                else{
                    System.out.println("Player 1 won The Game");
                }

            }
            else if(GusserProvided==P2){
                if(GusserProvided==P3){
                    System.out.println("Player 2 and player 3 Won the Game");
                } else{
                    System.out.println("Player 2 Won the Game");
                }
            }
            else if(GusserProvided==P3){
                System.out.println("Player 3 Won the Game");
            }
            else{
                System.out.println("All Players Lost The Game");
            }
            }

            }
    
class Game{
    public static void main(String args[]){
        Empire e= new Empire( );
        e.compare( );

    }
}