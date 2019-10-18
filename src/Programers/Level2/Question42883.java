package Programers.Level2;

public class Question42883 {
    public static void main(String[] args){
        Question42883 q = new Question42883();
        System.out.println(q.solution("1924",2));
    }

    private String solution(String number, int k) {
        int count = number.length() - k;
        String answer = "";
        int front = 0;
        int back = number.length();
        int current = 0;
        String sliceNum= "";

        while (count > 0){
            back = number.length() - count;
            sliceNum = number.substring(front, back+1);
            for(int i = 9; i>=0; i--){
                current = sliceNum.indexOf(String.valueOf(i));
                if(current > -1){
                    answer += sliceNum.charAt(current);
                    break;
                }
            }
            count --;
            front = front+current+1;
        }

        return answer;
    }
}
