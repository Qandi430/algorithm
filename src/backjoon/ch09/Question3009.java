package backjoon.ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] point = new int[4][2];
        String input = "";
        for(int i = 0; i<3; i++){
            input = br.readLine();
            point[i][0] = Integer.parseInt(input.split(" ")[0]);
            point[i][1] = Integer.parseInt(input.split(" ")[1]);
        }

    }
}
