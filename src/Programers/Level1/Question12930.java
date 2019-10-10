package Programers.Level1;

public class Question12930 {
    public static void main(String[] args){
        System.out.println(solution("try hello world"));
    }
    public static String solution(String s){
        String answer = "";
        String[] sentenceArray = s.split("");
        int count = 0;
        char alphabet;

        for(int i = 0; i< sentenceArray.length; i++){
            alphabet = sentenceArray[i].charAt(0);
            if(alphabet == 32){
                answer += " ";
                count = 0;
            }else{
                if(count%2==0){
                    if(alphabet <= 91 ) answer += (char)alphabet;
                    else answer += (char)(alphabet-32);
                }else{
                    if(alphabet <= 91 ) answer += (char)(alphabet+32);
                    else answer += (char)alphabet;
                }
                count ++;
            }
        }

        return answer;
    }
}
