package backjoon.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfHouse = Integer.parseInt(br.readLine());
        int[][] house = new int[numOfHouse][3];
        int index=0,min = 0,result = 0,minIndex = 0;

        for(int i = 0; i<numOfHouse; i++){
            String price = br.readLine();
            house[i][0] = Integer.parseInt(price.split(" ")[0]);
            house[i][1] = Integer.parseInt(price.split(" ")[1]);
            house[i][2] = Integer.parseInt(price.split(" ")[2]);
        }

        while(index < numOfHouse){
            min = 1000;
            for(int i = 0; i<3; i++){
                if(index != 0){
                    if(i == minIndex) continue;
                }
                if(i==0){
                    min = house[index][i];
                    minIndex = 0;
                }else{
                    if(house[index][i] < min){
                        min = house[index][i];
                        minIndex = i;
                    }
                }
            }
            result += min;

            index ++;
        }

        System.out.println(result);
    }
}
