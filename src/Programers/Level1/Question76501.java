package Programers.Level1;

public class Question76501 {
    public static void main(String[] args){
        int[] absolutes1 = {4, 7, 12};
        boolean[] signs1 = {true, false, true};
        System.out.println(solution(absolutes1,signs1));
        int[] absolutes2 = {1, 2, 3};
        boolean[] signs2 = {false, false, true};
        System.out.println(solution(absolutes2,signs2));
    }
    public static int solution(int[] absolutes, boolean[] signs){
        int answer = 0;
        for(int i = 0; i<absolutes.length; i++){
            answer += signs[i] ? absolutes[i] : (absolutes[i] * -1);
        }
        return answer;
    }
}
