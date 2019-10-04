package backjoon.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int height = Integer.parseInt(br.readLine());
        int[][] triangle = new int[height][height];
        int result = 0;
        int current = 0;
        int left,right;
        int index = 0;

        for(int i = 0; i<height; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j<input.length; j++){
                triangle[i][j] = Integer.parseInt(input[j]);
            }
        }

        while(index == height){

        }
    }
}
