package Challenges;

public class secondChallenge {
    public static void main(String[] args) {
    /* Method Challenge
    The first method should be named displayHighScorePosition
    This method should have 2 parameters, one for a player's name, and one for
        a player's position on the high score list
    The method should print a message " Name managed to get into position 2 on
        the high score list."

    The second method should be named calculateHighScorePosition
    This method should have only 1 parameter, the player's score
    This method should return a number between 1 and 4, based on the score values
        show below

    Score >= 1000 = 1
    Score >= 500 but < 1000 = 2
    Score >= 100 but < 500 = 3
    All other scores = 4

    Finally, call both methods and display the results for the following scores:
    1500, 1000, 500, 100, and 25.
    */
        displayHighScorePosition("Zach", calculateHighScorePosition(1500));
        displayHighScorePosition("Zach", calculateHighScorePosition(1000));
        displayHighScorePosition("Zach", calculateHighScorePosition(500));
        displayHighScorePosition("Zach", calculateHighScorePosition(100));
        displayHighScorePosition("Zach", calculateHighScorePosition(25));


    }


    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition (int playerScore) {
        int playerPosition = 0;

        if (playerScore >= 1000) {
            playerPosition = 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            playerPosition = 2;
        } else if (playerScore >= 100 && playerScore < 500){
            playerPosition = 3;
        } else {
            playerPosition = 4;
        }
        return playerPosition;
    }
}