package backjoon.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfHouse = Integer.parseInt(br.readLine());
        int[][] house = new int[numOfHouse][3];
        int[] costArray = new int[3];
        int index=0,min = 0,result = 0,currIndex = 0;

        for(int i = 0; i<numOfHouse; i++){
            String price = br.readLine();
            house[i][0] = Integer.parseInt(price.split(" ")[0]);
            house[i][1] = Integer.parseInt(price.split(" ")[1]);
            house[i][2] = Integer.parseInt(price.split(" ")[2]);
        }

        for(int i = 0; i< 3; i++){
            result = house[0][i];
            currIndex = i;
            for(int j = 1; j<numOfHouse; j++){
                min = getMin(house[j],currIndex);
                result += house[j][min];
                currIndex = min;
            }
            costArray[i] = result;
        }

        for(int a : costArray){
            System.out.println(a);
        }

        System.out.println(costArray[getMin(costArray,3)]);
    }

    private static int getMin(int[] house, int index) {
        if(index == 0) return house[1] < house[2] ? 1:2;
        else if(index == 1) return house[0] < house[2] ? 0:2;
        else return house[0] < house[1] ? 0:1;
    }
}
