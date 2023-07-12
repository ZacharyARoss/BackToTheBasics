package org.example;

public class SwitchStatement {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1){
//            System.out.println("value was 1");
//        } else if (value == 2){
//            System.out.println("value was 2");
//        } else {
//            System.out.println("value was not 1 or 2");
//        }

        //normal if else statement but now switch
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3, a 4, or 5");
                System.out.println("actually it was " + switchValue);
            }
            default -> System.out.println("value was not 1, 2, 3, 4, or 5");
        }
        String month = "November";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "bad";
        };
    }
}

