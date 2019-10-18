package backjoon.ch09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String answer = "";
        int a,b,c;
        while (!input.equals("0 0 0")){
            a = 0;
            b = 0;
            c = 0;

            for(int i = 0; i<3; i++){
                int current =Integer.parseInt(input.split(" ")[i]);
                if( current > c){
                    if( a > 0){
                        b = c;
                    }else{
                        a = c;
                    }
                    c = current;
                }else{
                    if(c > 0){
                        if( a > 0){
                            b = current;
                        }else{
                            a = current;
                        }
                    }else{
                        c = current;
                    }
                }
            }
            answer = a*a+b*b==c*c ? "right":"wrong";
            System.out.println(answer);
            input = br.readLine();
        }

    }
}
