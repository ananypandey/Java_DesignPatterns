package TicTacToe;

import java.util.Scanner;

public class PlayGame
{
    public static void main(String[] args)
    {
        Player p1 = new Player("Anay");
        Player p2 = new Player("Amey");
        Player[] players = new Player[2];
        players[0]=p1;
        players[1]=p2;
        System.out.println("Type yes to start game : ");
        Scanner scan = new Scanner(System.in);
        String startGame=scan.nextLine();
        if(startGame.equalsIgnoreCase("YES"))
        {
            System.out.println("Inside Game");
            GameBoard.startMatch(players,3);
        }
    }
}
