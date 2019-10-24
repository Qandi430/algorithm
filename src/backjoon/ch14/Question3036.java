package backjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ringCnt = Integer.parseInt(br.readLine());
        String[] ringArr = br.readLine().split(" ");
        int base = Integer.parseInt(ringArr[0]);
        int g,x,target;

        for(int i = 1; i<ringCnt; i++){
            target = Integer.parseInt(ringArr[i]);
            x = 0;
            g = 0;
            while (x < base && x < target) {
                x++;
                if (base % x == 0 && target % x == 0) g = x;
            }
            System.out.println(base/g+" / "+target/g);
        }
    }
}
