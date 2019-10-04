package Programers.Level1;

public class Question42862 {
    public static void main(String[] args){
        System.out.println(solution(7, new int[]{2,3,4}, new int[]{1,2,3,6}));
    }

    public static int solution(int n, int[] lost, int[] reserve){
        int answer = n-lost.length;

        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for(int i = 0; i< lost.length; i++){
            if(lost[i] != -1){
                for(int j = 0; j<reserve.length; j++){
                    if(reserve[j] != -1){
                        if(reserve[j] == lost[i]-1 || reserve[j] == lost[i] || reserve[j] == lost[i]+1 ){
                            answer ++;
                            reserve[j] = -1;
                            break;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
