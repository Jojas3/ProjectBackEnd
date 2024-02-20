import java.util.*;

//pretend this is a server
public class Service {
    /*a part of me feels like i have too many getters and setters and private variables
    but also i can see future use cases where other methods in other classes would need these.
    Is this a normal amount to have? */

    //set true when game is active, set false when game-over
    private static boolean gameStatus;
    //True if two players, false if single player.
    private static boolean multiplayer;

    //keeps track of the number of player ships remaining on the board
    private int playerOneShips, playerTwoShips;

    //checks if shots are hit
    private boolean isHit, isMiss;

    //stats tracking p1
    private int p1ShotsHit, p1ShotsMiss;

    //stats tracking p2
    private int p2ShotsHit, p2ShotsMiss;

    //ship location, player1
    private int x1;
    private int y1;

    //ship location, player2
    private int x2;
    private int y2;

    //ship length
    private int length;



    //this method will loop player turns until game-over
    public static void gameLoop() {
        System.out.println("Starting game!!!");


        while(gameStatus) {
            Turn.playerOne();
            Turn.playerTwo();
        }
        System.out.println("GAME OVER. Thank you for playing!");

    }

    //getters and setters
    protected static void setMultiplayer() {
        boolean multiplayer=false;
        Scanner input = new Scanner(System.in);
        System.out.println("\nAre you playing alone? \n");
        System.out.println("Enter yes or no: ");
        String yn = input.nextLine();
        if(yn.equalsIgnoreCase("yes")){
            multiplayer = false;
        }else if (yn.equalsIgnoreCase("no")) {
            multiplayer = true;
        }else{
            System.out.println("ERROR: You must enter 'yes' or 'no'");
            setMultiplayer();
        }
        Service.multiplayer = multiplayer;
    }
    public static boolean isMultiplayer() {
        return multiplayer;
    }





    public int getX1() {
        return this.x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return this.y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return this.x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return this.y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(boolean gameStatus) {
        Service.gameStatus = gameStatus;
    }


    public int getPlayerOneShips() {
        return playerOneShips;
    }

    public void setPlayerOneShips(int playerOneShips) {
        this.playerOneShips = playerOneShips;
    }

    public int getPlayerTwoShips() {
        return playerTwoShips;
    }

    public void setPlayerTwoShips(int playerTwoShips) {
        this.playerTwoShips = playerTwoShips;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public boolean isMiss() {
        return isMiss;
    }

    public void setMiss(boolean miss) {
        isMiss = miss;
    }

    public int getP1ShotsHit() {
        return p1ShotsHit;
    }

    public void setP1ShotsHit(int p1ShotsHit) {
        this.p1ShotsHit = p1ShotsHit;
    }

    public int getP1ShotsMiss() {
        return p1ShotsMiss;
    }

    public void setP1ShotsMiss(int p1ShotsMiss) {
        this.p1ShotsMiss = p1ShotsMiss;
    }

    public int getP2ShotsHit() {
        return p2ShotsHit;
    }

    public void setP2ShotsHit(int p2ShotsHit) {
        this.p2ShotsHit = p2ShotsHit;
    }

    public int getP2ShotsMiss() {
        return p2ShotsMiss;
    }

    public void setP2ShotsMiss(int p2ShotsMiss) {
        this.p2ShotsMiss = p2ShotsMiss;
    }
}
