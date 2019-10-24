package backjoon.ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int answer = 0;
        int min;
        String[] arr = br.readLine().split(" ");

        for(int i = 0; i< testCase; i++){
            min = i;
            for(int j = i+1; j< testCase; j++){
                if(Integer.parseInt(arr[j]) < Integer.parseInt(arr[min])){
                    min = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            for(int k = 0; k<=i; k++){
                answer += Integer.parseInt(arr[k]);
            }
        }

        System.out.println(answer);
    }
}
