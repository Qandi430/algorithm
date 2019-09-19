package backjoon.ch06;

public class Question11729 {
    private static int count = 0;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        int n = new java.util.Scanner(System.in).nextInt();
        move(n,1,2,3);
        sb.insert(0,count+"\n");
        System.out.println(sb);
    }

    public static void move(int num,int from, int by, int to){
        ++count;
        if(num == 1){
            sb.append(from+" "+to+"\n");
        }else{
            move(num-1,from,to,by);
            sb.append(from+" "+to+"\n");
            move(num-1,by,from,to);
        }
    }

}
