package Programers.Level2;

public class Question42746 {
    public static void main(String[] args){
        Question42746 q = new Question42746();
        System.out.println(q.solution(new int[]{3, 30, 34, 5, 9}));
    }

    private String solution(int[] numbers) {
        String answer = "";
        int max;
        int temp;
        for(int i = 0; i<numbers.length-1; i++){
            for(int j = i+1; j<numbers.length; j++){
                if(String.valueOf(numbers[i]).charAt(0) <= String.valueOf(numbers[j]).charAt(0)){
                    if(String.valueOf(numbers[i]).charAt(0) == String.valueOf(numbers[j]).charAt(0)){

                    }else{
                        temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }
        for(int a : numbers){
            System.out.println(a);
        }

        return answer;
    }
}
