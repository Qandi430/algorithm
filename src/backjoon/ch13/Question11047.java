package backjoon.ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int[] coinList;
        int numOfCoin,sum,count = 0;

        input = br.readLine();

        numOfCoin = Integer.parseInt(input.split(" ")[0]);
        sum = Integer.parseInt(input.split(" ")[1]);
        coinList = new int[numOfCoin];

        for(int i = 0; i<numOfCoin; i++){
            coinList[i] = Integer.parseInt(br.readLine());
        }

        while(sum > 0){
            for(int i = coinList.length-1; i>=0; i--){
                if(sum >= coinList[i]){
                    sum -= coinList[i];
                    break;
                }
            }
            count++;
        }

        System.out.println(count);

    }
}
