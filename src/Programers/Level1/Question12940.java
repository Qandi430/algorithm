package Programers.Level1;

public class Question12940 {
    public static void main(String[] args){
        int[] result = solution(3,12);
        for (int r : result) System.out.println(r);
    }
    public static int[] solution(int n, int m){
        int[] answer = new int[2];
        int g = 0,x = 0;
        while(x < n && x<m){
            x++;
            if(n%x ==0 && m%x ==0) g = x;
        }
        answer[0] = g;
        answer[1] = (n/g)*(m/g)*g;
        return answer;
    }
}
