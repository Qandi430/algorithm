package Programers.Level2;

public class Question42588 {
    public static void main(String[] args){
        Question42588 q = new Question42588();
        int[] result = q.solution(new int[]{1,5,3,6,7,6,5});
        for(int r : result)
            System.out.println(r);
    }

    private int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for(int i = heights.length -1; i >= 0; i--){
            for(int j = i-1; j >= 0; j--){
                if(heights[i] < heights[j]){
                    answer[i] = j+1;
                    break;
                }
            }
        }

        return answer;
    }
}
