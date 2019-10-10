package Programers.Level1;

public class Question12910 {
    public static void main(String[] args){
        int[] result = solution(new int[]{2,36,1,3},1);
        for(int a : result){
            System.out.println(a);
        }
    }
    public static int[] solution(int[] arr, int divisor){
        int[] answer = {};
        int cnt = 0;
        int current = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]% divisor== 0) cnt++;
        }

        if(cnt == 0){
            answer = new int[]{-1};
        }else{
            answer = new int [cnt];

            for(int i = 0;i<arr.length; i++){
                if(arr[i]%divisor == 0){
                    answer[current] = arr[i];
                    if(current != 0){
                        for(int j = current; j > 0; j--){
                            if(answer[j] > answer[j-1]) break;
                            else{
                                int temp = answer[j];
                                answer[j] = answer[j-1];
                                answer[j-1]  = temp;
                            }
                        }
                    }
                    current++;
                }
            }
        }


        return answer;
    }
}
