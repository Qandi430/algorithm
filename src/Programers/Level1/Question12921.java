package Programers.Level1;

public class Question12921 {
    public static void main(String[] args){
        System.out.println(solution(5));
    }
    public static int solution(int n){
        int answer = 0;
        boolean[] numArray = new boolean[n+1];

        for( int i = 2; i <= n; i++){
            for(int j = 2; i*j <= n; j++){
                numArray[i*j] = true;
            }
        }

        for(boolean b : numArray){
            System.out.println(b);
        }

        for(int i = 2; i<=n; i++){
            if(!numArray[i])answer ++;
        }


        return answer;
    }
}
