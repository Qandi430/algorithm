package Programers.Level1;

public class Question12935 {
    public static void main(String[] args){
        int[] result = solution(new int[]{3,6,1,8});
        for(int r : result)
            System.out.println(r);
    }
    public static int[] solution(int[] arr){
        int[] answer = {};
        int min = 0;
        int index = 0;
        if(arr.length == 1){
            answer = new int[]{-1};
        }else{
            answer = new int[arr.length-1];
            for(int i = 0; i<arr.length; i++){
                if(arr[i] < arr[min]) min = i;
            }

            for(int i = 0; i<arr.length; i++){
                if(i != min){
                    answer[index++] = arr[i];
                }
            }
        }

        return answer;
    }
}
