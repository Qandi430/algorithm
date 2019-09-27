package backjoon.ch12;

import java.io.*;

public class Question1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] array = new long[n+1];

        for(int i = 0; i<=n;i++){
            if(i <= 2){
                array[i] = i;
            }else{
                array[i] = (array[i-1]+array[i-2])%15746;
            }

            System.out.println(i+"번째 : "+array[i]);
        }

        System.out.println(array[n]);
    }
}
