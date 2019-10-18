package Programers.Level2;

public class Question42585 {
    public static void main(String[] args){
        Question42585 q = new Question42585();
        System.out.println(q.solution("()(((()())(())()))(())"));
    }

    private int solution(String arrangement) {
        int answer = 0;
        int front = 0;
        int pair = 0;
        int frontCnt;
        int rearCnt;
        int cnt = 0;
        String stick = "";

        while(front < arrangement.length()){
            if(arrangement.charAt(front) == '('){
                if(arrangement.charAt(front+1) != ')'){
                    frontCnt = 0;
                    rearCnt = 0;
                    cnt = 0;
                    for(int i = front; i< arrangement.length(); i++){
                        if(arrangement.charAt(i) == '(') frontCnt++;
                        else rearCnt++;
                        if(frontCnt == rearCnt){
                            pair = i;
                            break;
                        }
                    }
                    stick = arrangement.substring(front,pair+1);
                    System.out.println(stick);
                    for(int i = 0; i<stick.length(); i++){
                        if(stick.charAt(i) == '('){
                            if(stick.charAt(i+1) == ')') cnt++;
                        }
                    }
                    System.out.println(cnt+1);
                    answer += cnt+1;
                }
            }
            front++;
        }

        return answer;
    }
}
