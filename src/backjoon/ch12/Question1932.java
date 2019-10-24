package backjoon.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int height = Integer.parseInt(br.readLine());
        String[] triangle = new String[height];
        int index = 1;
        int answer = Integer.parseInt(triangle[0]);
        int answer2 = Integer.parseInt(triangle[0]);
        for(int i = 0; i<height; i++){
            triangle[i] = br.readLine();
        }

        while (index < height){
            if(index > 2){

            }
            index ++;
        }
    }
}
