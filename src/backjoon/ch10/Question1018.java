package backjoon.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        input = br.readLine();
        int width = Integer.parseInt(input.split(" ")[0]);
        int height = Integer.parseInt(input.split(" ")[1]);
        String[][] chess = new String[height][width];

        for(int i = 0; i<height; i++){
            input = br.readLine();
            for(int j = 0; j<width; j++){
                chess[i][j] = input.split("")[j];
            }
        }

        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
}
