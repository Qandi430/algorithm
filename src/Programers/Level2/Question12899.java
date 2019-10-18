package Programers.Level2;

public class Question12899 {
    public static void main(String[] args){
        Question12899 question = new Question12899();
        for(int i = 1; i<=100; i++){
            System.out.println("================="+i+"================");
            System.out.println(question.solution(i));
        }

    }
    public String solution(int n){
        String answer  = "";
        String prefix = "";

        while(n > 0){
            if(n%3 == 0){
                prefix = "4";
                n = n/3-1;
            }else{
                prefix = String.valueOf(n%3);
                n = n/3;
            }
            String temp = answer;
            answer = prefix + temp;

        }
        return answer;
    }
}
