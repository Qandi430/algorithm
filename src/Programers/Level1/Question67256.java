package Programers.Level1;

public class Question67256 {
    public static void main(String[] args){
        int[] numbers1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";
        System.out.println(solution(numbers1,hand1));
        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        System.out.println(solution(numbers2,hand2));
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";
        System.out.println(solution(numbers3,hand3));
    }

    public static String solution(int[] numbers,String hand){
        String answer = "";
        int[] leftPosition = {3,0};
        int[] rightPosition = {3,2};
        int[][] phone = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {-1,0,-1}
        };
        for(int i = 0; i<numbers.length; i ++ ){
            if(numbers[i] == 1||numbers[i] == 4||numbers[i] == 7){
                leftPosition = move(phone,numbers[i]);
                answer += "L";
            }else if(numbers[i] == 3||numbers[i] == 6||numbers[i] == 6){
                rightPosition = move(phone,numbers[i]);
                answer += "R";
            }else{
                int leftMove = 0;
                int rightMove = 0;
                int[] next = new int[2];
                if(numbers[i] == 2) {
                    next[0] = 0;
                    next[1] = 1;
                }else if(numbers[i] == 5){
                    next[0] = 1;
                    next[1] = 1;
                }else if(numbers[i] == 8){
                    next[0] = 2;
                    next[1] = 1;
                }else{
                    next[0] = 3;
                    next[1] = 1;
                }
                leftMove = Math.abs(leftPosition[0]-next[0])+Math.abs(leftPosition[1]-next[1]);
                rightMove = Math.abs(rightPosition[0]-next[0])+Math.abs(rightPosition[1]-next[1]);
                if(leftMove == rightMove){
                    if(hand.equals("left")){
                        leftPosition = move(phone,numbers[i]);
                        answer += "L";
                    }else {
                        rightPosition = move(phone,numbers[i]);
                        answer += "R";
                    }
                }else if(leftMove < rightMove){
                    leftPosition = move(phone,numbers[i]);
                    answer += "L";
                }else{
                    rightPosition = move(phone,numbers[i]);
                    answer += "R";
                }
            }
        }
        return answer;
    }

    public static int[] move(int[][] phone,int number){
        int[] result = new int[2];
        for(int j = 0; j<4; j++){
            for(int k = 0; k<3; k++){
                if(phone[j][k] == number){
                    result[0] = j;
                    result[1] = k;
                    break;
                }
            }
        }
        return result;
    }

}
