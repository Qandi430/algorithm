package backjoon.ch07;

public class Question1152 {
    public static void main(String[] args){
        int result = 0;
        String input = new java.util.Scanner(System.in).nextLine();
        String[] wordArray = input.split(" ");
        for(String word : wordArray){
            if(!word.equals("")) result ++;
        }
        System.out.println(result);
    }
}
