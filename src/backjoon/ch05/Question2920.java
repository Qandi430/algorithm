package backjoon.ch05;

import java.util.Scanner;

public class Question2920 {
    public static void main(String[] args){
        String status = "mixed";
        Scanner sc = new Scanner(System.in);
        int temp = 0 ,input;

        for(int i = 0; i < 8; i++){
            input = sc.nextInt();
            if(temp == 0){
                temp = input;
                status = temp == 1 ?  "ascending" : "descending";
            }else if(status.equals("ascending")){
                if(input < temp){
                    status = "mixed";
                    break;
                }
                temp = input;
            }else if(status.equals("descending")){
                if(input > temp){
                    status = "mixed";
                    break;
                }
                temp = input;
            }
        }
        System.out.println(status);
    }
}
