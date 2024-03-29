package backjoon.ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cntRoom = Integer.parseInt(br.readLine());
        String input;
        int timeTable[][] = new int[cntRoom][2];
        int result = 0;
        int index = 0;
        int current[] = new int[2];

        for(int i = 0; i<cntRoom; i++){
            input = br.readLine();
            timeTable[i][0] = Integer.parseInt(input.split(" ")[0]);
            timeTable[i][1] = Integer.parseInt(input.split(" ")[1]);
        }
        timeTable = mergeSort(timeTable,0,timeTable.length-1);

        while (index < cntRoom){
            for(int i = index +1; i<cntRoom; i++){
                if(timeTable[i][0]  > timeTable[index][1]){
                    break;
                }
                if(timeTable[index][1]-timeTable[index][0] > timeTable[i][1]-timeTable[i][0]){
                    index = i;
                }
            }
            System.out.println(timeTable[index][0]+" "+timeTable[index][1]);
            index += 1;
            result++;
        }
        System.out.println(result);
    }

    public static int[][] mergeSort(int[][] data, int first, int last){

        if(last>first){
            int middle = (first+last)/2;
            mergeSort(data,first,middle);
            mergeSort(data,middle+1,last);
            sort(data,first,middle,last);
        }
        return data;
    }

    public static void sort(int[][] data,int first,int middle,int last){
        int[][] tmpArray = new int[data.length][2]; //합병 정렬 임시 저장
        int leftStart = first;        //분열된 왼쪽배열 시작
        int tmpIndex = first;         //합병되는 배열의 시작
        int rightStart = middle+1;    //분열된 오른쪽 배열 시작

        while(leftStart <= middle && rightStart<=last){     //왼쪽 배열과 오른쪽 배열차례대로 비교하여 임시배열에 넣기
            if(data[leftStart][0] < data[rightStart][0]){         //왼쪽 배열의 원소가 작을 경우
                tmpArray[tmpIndex] = data[leftStart];
                leftStart++;
            }else{                                          //오른쪽 배열의 원소가 작을 경우
                tmpArray[tmpIndex] = data[rightStart];
                rightStart++;
            }
            tmpIndex ++;
        }

        while (leftStart <= middle){        //왼쪽배열에 아직 원소가 남은경우
            tmpArray[tmpIndex] = data[leftStart];
            leftStart ++;
            tmpIndex++;
        }

        while(rightStart <= last){          //오른쪽 배열에 원소가 남은경우
            tmpArray[tmpIndex] = data[rightStart];
            rightStart++;
            tmpIndex++;
        }

        for(int i =first; i<=last; i++){
            data[i] = tmpArray[i];
        }
    }

}
