package TicTacToe;

import java.util.*;

public class GameBoard
{
    HashMap<Player,Character> map = new HashMap<>();
    HashMap<Integer, ArrayList<Integer>> boardmap = new HashMap<>();
    static GameBoard gameBoard=null;
    char[][] board;
    int boardLength;
    Queue<Player> queue;
    private GameBoard(Player[] players,int n)
    {
        queue = new LinkedList<>();
        map.put(players[0],'X');
        map.put(players[0],'O');
        queue.add(players[0]);
        queue.add(players[1]);
        boardLength = 2*n-1;
        initializeBoardMap();
        board = new char[2*n-1][2*n-1];
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                if(i%2==1)
                {
                    board[i][j]='-';
                }
                else if(j%2==1){
                    board[i][j]='|';
                }
            }
        }
        printTable();
        playerTurn();
    }
    void initializeBoardMap()
    {
        int k=1;
        for(int i=0;i<(boardLength+1)/2;i++)
        {
            for(int j=0;j<(boardLength+1)/2;j++)
            {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(i*2);
                arrayList.add(j*2);
                boardmap.put(k, arrayList);
                k++;
            }
        }
    }
    void playerTurn()
    {
        int count=0;
        while (count<10)
        {
            Player turn = queue.peek();
            queue.remove();
            queue.add(turn);
            System.out.println(turn.username+" enter position :");
            Scanner scan = new Scanner(System.in);
            int pos = Integer.parseInt(scan.nextLine());
            while(!verify(pos))
            {
                System.out.println("Enter Valid Position");
                pos = Integer.parseInt(scan.nextLine());
            }
            if(count%2==0)
            {
                board[boardmap.get(pos).get(0)][boardmap.get(pos).get(1)]='X';
                boardmap.remove(pos);
            }
            else if(count%2==1)
            {
                board[boardmap.get(pos).get(0)][boardmap.get(pos).get(1)]='O';
                boardmap.remove(pos);
            }
            if(computeWinner())
            {
                System.out.println("Winner is : "+turn.username);
                break;
            }
            count++;
            printTable();
        }
        if(count==10)
        {
            System.out.println("Match Was Draw");
        }
    }
    boolean computeWinner()
    {
        if((board[0][0]=='X' || board[0][0]=='O') && (board[0][2]=='X'||board[0][2]=='X') && (board[0][4]=='X' || board[0][4]=='O'))
        {
            return true;
        }
        if((board[2][0]=='X' || board[2][0]=='O') && (board[2][2]=='X'||board[2][2]=='X') && (board[2][4]=='X' || board[2][4]=='O'))
        {
            return true;
        }
        if((board[4][0]=='X' || board[4][0]=='O') && (board[4][2]=='X'||board[4][2]=='X') && (board[4][4]=='X' || board[4][4]=='O'))
        {
            return true;
        }
        return false;
    }

    boolean verify(int pos)
    {
        if(!boardmap.containsKey(pos))
        {
            System.out.println("Hi");
            return false;
        }
        return true;
    }
    private void printTable()
    {
        int n = board.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    static void startMatch(Player[] players,int n)
    {
    System.out.println(gameBoard);
      if(gameBoard==null)
      {
            gameBoard = new GameBoard(players,n);
      }
    }

}
