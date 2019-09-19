package backjoon.ch07;

public class Question1157 {
    public static void main(String[] args){
        String input = new java.util.Scanner(System.in).next();
        int[] alphabet = new int[26];
        int max = 0;
        char result ='A';
        int currentChar;

        for(int i = 0; i<input.length(); i++){
            currentChar = input.charAt(i)-65;
            if(currentChar > 26) currentChar -=32;
            alphabet[currentChar] ++;
        }

        for(int i = 0; i<alphabet.length; i++){
            if(alphabet[i] == max && max != 0){
                result = '?';
            }else if(alphabet[i]>max){
                max = alphabet[i];
                result = (char)(i+65);
            }
        }
        System.out.println(result);
    }
}
