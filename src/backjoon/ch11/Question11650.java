package backjoon.ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String input;
        int[][] locations = new int[size][2];
        int[] temp;

        for(int i = 0; i<size; i++){
            input = br.readLine();
            locations[i][0] = Integer.parseInt(input.split(" ")[0]);
            locations[i][1] = Integer.parseInt(input.split(" ")[1]);
        }

        for(int i = 0; i<size; i++){
            for(int j = 0; j < size; j++){
                if(i != j){
                    if(locations[i][0] < locations[j][0]){
                        temp = locations[i];
                        locations[i] = locations[j];
                        locations[j] = temp;
                    }else{
                        if(locations[i][0] == locations[j][0]){
                            if(locations[i][1] < locations[j][1]){
                                temp = locations[i];
                                locations[i] = locations[j];
                                locations[j] = temp;
                            }
                        }
                    }
                }
            }
        }

        for(int[] location : locations){
            System.out.println(location[0]+" "+location[1]);
        }
    }
}
