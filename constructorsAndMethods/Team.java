package constructorsAndMethods;

public class Team {

    String playerName;
    int playerNumber;


    //Constructors1
    public Team (){
    System.out.println("no player added");
    }

    //Constructors2                                      //the constructor is the definition of the object.
    public Team (String playerName){
        this.playerName = playerName;
        System.out.println("the player name is: "+ playerName);
    }

    //Constructors3
     public Team (String playerName, int playerNumber){
         this.playerName = playerName;
         this.playerNumber = playerNumber;
         System.out.println( "the player name is:  "+ playerName + " the player number is : " + playerNumber);
    }

    //Methods
     public void position (){
         System.out.println( "winger");
     }

     public void task(){
         System.out.println("score goals");
     }

     public String getPlayerName (){
         System.out.println("The player name is : "+ playerName);
         return playerName;

     }
     public int getPlayerNumber(){
         System.out.println("the player number is: "+ playerNumber);
         return playerNumber;
     }
}
