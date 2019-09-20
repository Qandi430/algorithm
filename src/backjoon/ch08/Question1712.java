package backjoon.ch08;

import java.io.*;

public class Question1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String array = br.readLine();
        long a = Integer.parseInt(array.split(" ")[0]),b = Integer.parseInt(array.split(" ")[1]),c = Integer.parseInt(array.split(" ")[2]);
        long result;

        if(c-b > 0){
            result = a/(c-b)+1;
        }else{
            result = -1;
        }

        System.out.println(result);
    }
}
