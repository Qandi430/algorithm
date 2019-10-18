package backjoon.ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int memCnt  = Integer.parseInt(br.readLine());
        String[][] memList = new String[memCnt][2];
        String input;
        int min;
        for(int i = 0; i< memCnt; i++){
            input = br.readLine();
            memList[i][0] = input.split(" ")[0];
            memList[i][1] = input.split(" ")[1];
        }

        for(int i = 0; i< memCnt-1; i++){
            min = i;
            for(int j  = i+1; j<memCnt; j++){
                if(memList[i]!=null){
                    if(Integer.parseInt(memList[min][0] )> Integer.parseInt(memList[j][0])){
                        min = j;
                    }
                }
            }
            String[] temp = memList[min];
            for(int k = min; k >i; k--){
                memList[k] = memList[k-1];
            }
            memList[i] = temp;
        }

        for(String[] a : memList){
            for(String b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }
}
