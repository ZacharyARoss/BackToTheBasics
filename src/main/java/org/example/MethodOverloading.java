package org.example;

public class MethodOverloading {
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        return ((feet * 12) + inches) * 2.54;
    }
}
