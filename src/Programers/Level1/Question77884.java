package Programers.Level1;

public class Question77884 {
    public static void main(String[] args){
        int left1 = 13;
        int right1 = 17;
        System.out.println(solution(left1,right1));
        int left2 = 24;
        int right2 = 27;
        System.out.println(solution(left2,right2));
    }
    public static int solution(int left,int right){
        int answer = 0;
        for(int i = left; i<=right; i++){
            boolean even = true;
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    even = !even;
                }
            }
            answer += even? i : i*-1;
        }
        return answer;
    }
}
