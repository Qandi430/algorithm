package Programers.Level1;

import java.util.ArrayList;
import java.util.List;

public class Question42840 {
    public static void main(String[] args){
        int[] result = solution(new int[]{1,3,2,4,2});

        for(int r : result){
            System.out.println(r);
        }
    }
    public static int[] solution(int[] answers){
        int[] answer = {};
        int[] result = new int[3];
        int index=0,current =0,max = 0,answerCount;

        int[] aAnswer = new int[]{1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
        int[] bAnswer = new int[]{2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5,2,1,2,3,2,4,2,5};
        int[] cAnswer = new int[]{3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5};


        while (index < answers.length){
            if(answers[index] == aAnswer[current]) result[0]++;
            if(answers[index] == bAnswer[current]) result[1]++;
            if(answers[index] == cAnswer[current]) result[2]++;

            index++;
            current++;
            if(current == 40) current = 0;
        }

        for(int i = 0; i<3; i++){
            if(result[i] > max) max = result[i];
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<3; i++){
            if(result[i] == max){
                list.add(i+1);
            }
        }

        answer = new int[list.size()];

        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
