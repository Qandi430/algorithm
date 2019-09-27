package backjoon.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int height = Integer.parseInt(br.readLine());
        int[][] triangle = new int[height][height];

        for(int i = 0; i<height; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0; j<input.length; j++){
                triangle[i][j] = Integer.parseInt(input[j]);
            }
        }

        for(int i = 0; i<height; i++){
            for(int a : triangle[i]){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
