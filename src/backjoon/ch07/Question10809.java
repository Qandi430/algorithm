package backjoon.ch07;

public class Question10809 {
    public static void main(String[] args){
        int[] alpabet = new int[26];

        for(int i = 0; i<alpabet.length; i++){
            alpabet[i] = -1;
        }

        String input = new java.util.Scanner(System.in).next();

        for(int i = 0; i<input.length(); i++){
            int order = (int)input.charAt(i) - 97;
            if(alpabet[order] == -1) alpabet[order] = input.indexOf(input.charAt(i));
        }

        for(int al : alpabet){
            System.out.print(al+" ");
        }
    }
}
