package backjoon.ch09;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int n;
        int min,max;
        boolean isSosu;
        for(int test = 0; test < testCase; test++){
            n = Integer.parseInt(br.readLine());
            max = n/2;
            while (max < n){
                isSosu = true;
                for(int i = 2; i<max-1; i++){
                    if(max%i == 0){
                        isSosu =false;
                        break;
                    }
                }
                if(isSosu){
                    min = n-max;
                    if(min < 2) continue;
                    for(int i = 2; i < min-1; i++){
                        if(min%i == 0){
                            isSosu = false;
                            break;
                        }
                    }
                    if(isSosu){
                        System.out.println(min+" "+max);
                        break;
                    }
                }
                max++;
            }
        }
    }
}
