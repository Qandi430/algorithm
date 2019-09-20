package backjoon.ch08;

public class Question1193 {
    public static void main(String[] args){
        long n = new java.util.Scanner(System.in).nextLong();
        int front = 1,back = 1,line = 0,max = 0;

        while(max < n){
            line ++;
            max += line;
        }

        System.out.println("line : "+line+" max : "+max+" input : "+n);

        if(line%2==0){
            front = (int) (line - (max-n));
            back = (int) (1 + (max-n));
        }else{
            front = (int) (1 + (max-n));
            back = (int) (line - (max-n));
        }

        System.out.println(front+"/"+back);

    }
}
