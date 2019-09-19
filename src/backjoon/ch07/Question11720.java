package backjoon.ch07;

import java.util.Scanner;

public class Question11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        String numArray = sc.next();
        int result = 0;

        for(String num : numArray.split("")){
            result += Integer.parseInt(num);
        }

        System.out.println(result);
    }
}
