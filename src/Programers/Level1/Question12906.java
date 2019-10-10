package Programers.Level1;

public class Question12906 {
    public static void main(String[] args){
        int[] result = solution(new int[]{1,1,3,3,0,1,1,});

        for(int a : result){
            System.out.println(a);
        }
    }
    public static int[] solution(int[] arr){
        int[] answer = {};
        int cnt = 1;
        int current = 0;

        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1]) continue;
            cnt++;
        }

        answer = new int[cnt];

        for(int i = 0; i<arr.length; i++){
            if(i==0){
                answer[current++] = arr[i];
            }
            else{
                if(arr[i] == arr[i-1]) continue;
                else answer[current++] = arr[i];
            }
        }

        return answer;
    }
}
