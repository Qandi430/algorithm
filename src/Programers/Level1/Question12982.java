package Programers.Level1;

public class Question12982 {
    public static void main(String[] args){
        System.out.println(solution(new int[]{1,3,2,5,4},9));
    }
    public static int solution(int [] d, int budget){
        int answer = 0;

        for(int i = 0; i<d.length; i++){
            for(int j = 0; j<d.length; j++){
                if(d[i] < d[j]){
                    int temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }

        while (answer < d.length){
            budget -= d[answer];
            if(budget < 0) break;
            answer++;
        }

        return answer;
    }
}
