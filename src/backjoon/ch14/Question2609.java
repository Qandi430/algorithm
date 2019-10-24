package backjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2609 {
    public static void main(String[] args) throws IOException {
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int m = Integer.parseInt(input.split(" ")[1]);
        int g = 0,x = 0;

        while(x < n && x<m){
            x++;
            if(n%x ==0 && m%x ==0) g = x;
        }

        System.out.println(g);
        System.out.println((n/g)*(m/g)*g);
    }
}
