package Challenges;

public class SwitchChallenge {
    /* Create a new Char Variable
    Use the traditional switch statement that tests the value in the variable from Step 1
    Create cases for the characters A, B, C, D, and E using the NATO phonetic alphabet
    Display a message in each case block, with the letter and the NATO word, then break,
    Add a default block, which displays the letter with a message saying not found.
     */

    public static void natoCase(char letter){
        switch (letter){
            case 'A':
                System.out.println("A = Able");
                break;
            case 'B':
                System.out.println("B = Baker");
                break;
            case 'C':
                System.out.println("C = Charlie");
                break;
            case 'D':
                System.out.println("D = Dog");
                break;
            case 'E':
                System.out.println("E = Easy");
                break;
            default:
                System.out.println(letter + "is not found in the Switch");
                break;

        }
    }

}
