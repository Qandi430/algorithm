package backjoon.ch07;

import java.util.Scanner;

public class Question2675 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        String input;
        int count;

        for(int test = 0; test<testCase; test++){
            count = sc.nextInt();
            input = sc.next();

            for(int i = 0; i<input.length(); i++){
                for(int j = 0; j< count; j++){
                    System.out.print(input.charAt(i));
                }
            }
        }
    }
}
