package Programers.Level1;

public class Question12950 {
    public static void main(String[] args){
        int[][] result = solution(new int[][]{{1,2},{2,3}} , new int[][] {{3,4},{5,6}});

        for(int i = 0; i<result.length; i++){
            for(int j = 0; j<result[i].length; j++){
                System.out.print(result[i][j]+",");
            }
            System.out.println();
        }

    }
    public static int[][] solution(int[][] arr1, int[][] arr2){
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}
