package backjoon.ch03;

import java.io.*;

public class Question15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String size = br.readLine();
        String num;

        for(int i = 0; i< Integer.parseInt(size); i++){
            num = br.readLine();
            bw.write(Integer.parseInt(num.split(" ")[0])+Integer.parseInt(num.split(" ")[1])+"\n");
        }
        bw.flush();
        bw.close();
    }
}
