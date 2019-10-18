package Programers.Level2;

public class Question42584 {
    public static void main(String[] args){
        Question42584 q = new Question42584();
        int[] result = q.solution(new int[]{1,2,3,2,3});
        for(int r : result){
            System.out.println(r);
        }
    }

    private int[] solution(int[] prices) {
        int[] answer = {};
        int index = 0;
        int sec = 0;
        answer = new int[prices.length];

        while (index < prices.length){
            sec = 0;
            for(int i = index+1; i<prices.length; i++){
                if(prices[index] > prices[i]){
                    sec++;
                    break;
                }
                sec++;
            }
            answer[index] = sec;
            index++;
        }


        return answer;
    }
}
