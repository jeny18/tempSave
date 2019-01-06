package constructorsAndMethods;

import classAndObject.House;

public class Test {

    public static void main (String[]args){

        Team Nicks = new Team();
        Team lakers = new Team("labron");
        Team newYork = new Team ( "bob", 10);

        Nicks.position();
        Nicks.task();

        Nicks.getPlayerName();
        Nicks.getPlayerNumber();

        lakers.getPlayerName();
        lakers.getPlayerNumber();

        newYork.getPlayerName();
        newYork.getPlayerNumber();

    }


}
