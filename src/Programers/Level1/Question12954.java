package Programers.Level1;

public class Question12954 {
    public static void main(String[] args){
        long[] result = solution(2,5);
        for(long l : result){
            System.out.println(l);
        }
    }
    public static long[] solution(int x, int n){
        long[] answer = new long[n];
        long add = 0;
        for(int i = 0; i<answer.length; i++)
            answer[i] = add+=x;
        return answer;
    }
}
