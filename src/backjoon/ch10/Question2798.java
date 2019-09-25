package backjoon.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);
        int [] cards = new int [N];

        input = br.readLine();
        for(int i = 0; i< input.split(" ").length; i++){
            cards[i] = Integer.parseInt(input.split(" ")[i]);
        }

        int max = 0;
        int temp = 0;

        for(int i = 0; i<cards.length; i++){
            for(int j = 0; j<cards.length; j++){
                if(i == j) continue;
                for(int k = 0;k<cards.length; k++){
                    if(k == i) continue;
                    if(k == j) continue;
                    temp = cards[i]+cards[j]+cards[k];
                    if(temp <= M){
                        if(temp > max) max = temp;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
