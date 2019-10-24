package swea.level1;

import java.util.Scanner;

public class Question8741 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        String input;
        String answer;
        for(int i = 1; i<=testCase; i++){
            answer = "";
            while (sc.hasNext()){
                input = sc.next();
                answer += (char)(input.charAt(0)-32);
            }
            System.out.println("#"+i+" "+answer);
        }
    }
}
