package Programers.Level2;

public class Question42860 {
    public static void main(String[] args){
        Question42860 q = new Question42860();
        System.out.println(q.solution("AZAAAZ"));
    }

    private int solution(String name) {
        int answer = 0;
        int index = 0;
        int currentChar;
        int frontCnt = 0;
        int backCnt  = 0;
        while(index < name.length()){
            currentChar = name.charAt(index)-65;
            if(currentChar > 13){
                answer += 26-currentChar;
            }else{
                answer += currentChar;
            }
            index ++;
        }

        for(int i = 1; i<name.length(); i++){
            if(i == name.length()-1){
                if(name.charAt(name.length()-i)-65 == 0 && name.charAt(i)-65 == 0) break;
                else if(name.charAt(name.length()-i)-65 == 0) backCnt--;
                else if(name.charAt(i)-65 == 0) frontCnt --;
            }
            frontCnt += 1;
            backCnt  += 1;
        }
        answer += frontCnt > backCnt ? backCnt : frontCnt;

        return answer;
    }

}
