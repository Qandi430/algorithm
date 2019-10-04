package Programers.Level1;

public class Question42748 {
    public static void main(String[] args){
        int[] result = solution(new int[]{1,5,2,6,3,7,4},new int[][]{{2,5,3},{4,4,1},{1,7,3}});
        for(int a : result){
            System.out.println(a);
        }
    }

    public static int[] solution(int[] array, int[][] commands){
        int[] answer = {};
        int[] tempArray;
        int min,max,size;
        answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++){

            min = commands[i][0];
            max = commands[i][1];
            size = max - min + 1;
            tempArray = new int[size];

            for(int j = min; j<= max; j++){
                tempArray[j-min] = array[j-1];
                if(j != min){
                    for(int k = 0; k<=j-min; k++){
                        if(tempArray[j-min] < tempArray[k]){
                            int temp = tempArray[k];
                            tempArray[k] = tempArray[j-min];
                            tempArray[j-min] = temp;
                        }
                    }
                }
            }

            answer[i] = tempArray[commands[i][2] -1 ];
        }

        return answer;
    }

}
