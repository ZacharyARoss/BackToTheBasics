package Subjects;

public class Blocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5555;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was greater than 1000 but less than 5000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("got here");
        }


    }
}
