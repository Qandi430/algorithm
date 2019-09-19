package backjoon.ch07;

public class Question5622 {
    public static void main(String[] args){
        String[] inputArray = new java.util.Scanner(System.in).next().split("");
        int result = 0;
        for(String input : inputArray){
            result += converter(input);
        }
        System.out.println(result);
    }

    private static int converter(String input) {
        switch (input){
            case "A":
            case "B":
            case "C":
                return 3;
            case "D":
            case "E":
            case "F":
                return 4;
            case "G":
            case "H":
            case "I":
                return 5;
            case "J":
            case "K":
            case "L":
                return 6;
            case "M":
            case "N":
            case "O":
                return 7;
            case "P":
            case "Q":
            case "R":
            case "S":
                return 8;
            case "T":
            case "U":
            case "V":
                return 9;
            case "W":
            case "X":
            case "Y":
            case "Z":
                return 10;
            default:
                return 2;
        }
    }

}
