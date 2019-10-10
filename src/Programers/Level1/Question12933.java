package Programers.Level1;

public class Question12933 {
    public static void main(String[] args){
        System.out.println(solution(118372));
    }
    public static long solution(long n){
        long answer = 0;
        long[] arr = new long[String.valueOf(n).length()];
        int index = 0;
        while (n>0){
            arr[index++] = (n%10);
            n/=10;
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    long temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        index = 1;

        for(int i = arr.length-1; i>=0; i--){
            answer += arr[i]*index;
            index *=10;
        }

        return answer;
    }

}
