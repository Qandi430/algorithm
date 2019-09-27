package backjoon.ch11;

import java.io.*;

public class Question10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int current;
        int numCounting[] = new int[10001];
        int max = 0;

        for(int i = 0; i<size; i++){
            current = Integer.parseInt(br.readLine());
            numCounting[current] ++;
            if(current > max) max = current;
        }
        br.close();

        for(int i = 0; i<=max; i++){
            while(numCounting[i] > 0){
                bw.write(i+"\n");
                numCounting[i]-=1;
            }
        }
        bw.flush();
        bw.close();
    }
}
