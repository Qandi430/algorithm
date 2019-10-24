package backjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input  = br.readLine();
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);

        while (!(a == 0 && b == 0)){
            if(a%b == 0){
                System.out.println("multiple");
            }else if(b%a==0){
                System.out.println("factor");
            }else{
                System.out.println("neither");
            }
            input = br.readLine();
            a = Integer.parseInt(input.split(" ")[0]);
            b = Integer.parseInt(input.split(" ")[1]);
        }
    }
}
