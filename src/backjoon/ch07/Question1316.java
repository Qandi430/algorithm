package backjoon.ch07;

import java.util.Scanner;

public class Question1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt(),result = 0;
        boolean isGroup;
        String input;

        for(int test = 0; test<testCase; test++){
            input = sc.next();
            isGroup = true;

            for(int i = 0; i<input.length(); i++){
                if(i != input.length() -1){
                    for(int j = i+1; j<input.length(); j++){
                        if(input.charAt(i) == input.charAt(j)){
                            if(j-1 != i){
                                isGroup = false;
                            }
                            break;
                        }
                        if(!isGroup){
                            break;
                        }
                    }
                }
            }
            if(isGroup)result ++;
        }
        System.out.println(result);
    }
}
