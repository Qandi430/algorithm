package backjoon.ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] side = new int[4];

        int x = Integer.parseInt(input.split(" ")[0]);
        int y = Integer.parseInt(input.split(" ")[1]);
        int w = Integer.parseInt(input.split(" ")[2]);
        int h = Integer.parseInt(input.split(" ")[3]);

        side[0] = h-y;
        side[1] = w-x;
        side[2] = y;
        side[3] = x;
        int min = side[0];
        for(int i = 1; i<4; i++){
            if(min > side[i]) min = side[i];
        }
        System.out.println(min);
    }
}
