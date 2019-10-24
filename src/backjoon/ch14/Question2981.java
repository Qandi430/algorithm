package backjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int[] numList = new int[cnt];
        int max = 0;
        boolean isTrue;
        int division;
        String answer = "";

        for(int i = 0; i<cnt; i++){
            numList[i] = Integer.parseInt(br.readLine());
            if(numList[i] > max) max = numList[i];
        }

        for(int i = 2; i <= max; i++){
            division = 0;
            isTrue = true;
            for(int j = 0; j<numList.length; j++){
                if(j == 0){
                    division  = numList[j]%i;
                }else if(division != numList[j]%i){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) answer += i+" ";
        }
        System.out.println(answer);
    }
}
