package Programers.Level1;

import java.util.ArrayList;
import java.util.List;

public class Question64061 {
    public static void main(String[] args){
        int[][] board1 = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves1 = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board1,moves1));
    }
    public static int solution(int[][] board, int[] moves){
        int answer = 0;
        List<Integer> pickList = new ArrayList<>();
        for(int i = 0; i<moves.length; i++){
            System.out.println("number : "+moves[i]);
            int[] find = find(board,moves[i]);
            if(find == null){
                continue;
            }
            pickList.add(board[find[0]][find[1]]);
            board[find[0]][find[1]] = 0;
            System.out.println("pick"+board[find[0]][find[1]]);
            System.out.println("pickList[pick] : "+pickList.toString());
            if(pickList.size() > 1 && pickList.get(pickList.size() -1) == pickList.get(pickList.size() -2)){
                pickList.remove(pickList.size() -1);
                pickList.remove(pickList.size() -1);
                answer += 2;
            }
            System.out.println("pickList[delete] : "+pickList.toString());
        }
        System.out.println("pickList : "+pickList.toString());
        return answer;
    }
    public static int[] find(int[][] board,int move){
        int[] result = new int[2];
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(j == move-1  && board[i][j] != 0 ){
                     result[0] = i;
                     result[1] = j;
                     return result;
                }
            }
        }
        return null;
    }
}
