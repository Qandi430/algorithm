package Programers.Level1;

import java.util.ArrayList;
import java.util.Collections;

public class Question68644 {
    public static void main(String[] args){
        int[] numbers1 = {2,1,3,4,1};
        System.out.println(solution(numbers1));
        int[] numbers2 = {5,0,2,7};
        System.out.println(solution(numbers2));
    }
    public static int[] solution(int[] numbers){
        ArrayList<Integer> sumList = new ArrayList<>();
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0;j<numbers.length; j++){
                if(i != j){
                    if(!sumList.contains(numbers[i]+numbers[j])){
                        sumList.add(numbers[i]+numbers[j]);
                    }
                }
            }
        }
        Collections.sort(sumList);
        int[] answer = new int[sumList.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = sumList.get(i);
        }
        return answer;
    }
}
