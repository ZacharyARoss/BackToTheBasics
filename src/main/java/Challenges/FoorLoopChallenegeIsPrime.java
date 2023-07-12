package Challenges;

public class FoorLoopChallenegeIsPrime {
    public static void main(String[] args) {
        int primeNumberCounter = 0;

        for(int i =10; i<=50;i++){
            if (isPrime(i)){
                System.out.println("number " + i + " is a prime number");
                primeNumberCounter++;
            } else {
                System.out.println("number " + i + " is not a prime number");
            } if (primeNumberCounter == 3){
                break;
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber==2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++){

            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
