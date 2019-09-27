package backjoon.ch12;

import java.io.*;

public class Question9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        long[] array;
        int n;
        for(int test = 0; test < testCase; test++){
            n = Integer.parseInt(br.readLine());
            array = new long[n+1];

            for(int i = 0; i<=n; i++){
                if(i <= 3){
                    array[i] = 1;
                }else{
                    array[i] = array[i-2]+array[i-3];
                }
            }

            System.out.println(array[n]);
        }
    }
}
