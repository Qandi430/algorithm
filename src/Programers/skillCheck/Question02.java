package Programers.skillCheck;

public class Question02 {
    public static void main(String[] args){
        int[] resultArray = solution(new int[]{4, 3, 2, 1});
        for(int r : resultArray){
            System.out.println(r);
        }
    }
    public static int[] solution(int[] arr){
        int[] answer = {};
        int min = 0,index = 0;
        if(arr.length == 1){
            answer = new int[]{-1};
        }else{
            answer = new int[arr.length -1];


            for(int i = 0; i< arr.length; i++){
                if(arr[i] < arr[min]) min = i;
            }

            for(int i = 0; i<arr.length; i++){
                if(i == min) continue;
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }
}
