package backjoon.ch11;

import  java.io.*;

public class Question11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String input;
        int[][] locations = new int[size][2];
        int[] temp;
        Question11650 q = new Question11650();
        for(int i = 0; i<size; i++){
            input = br.readLine();
            locations[i][0] = Integer.parseInt(input.split(" ")[0]);
            locations[i][1] = Integer.parseInt(input.split(" ")[1]);
        }

       q.mergeSort(locations,0,locations.length-1);

        for(int[] location : locations){
            System.out.println(location[0]+" "+location[1]);
        }
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
                if(data[leftStart][0] == data[rightStart][0]){
                    if(data[leftStart][1] < data[rightStart][1]){
                        tmpArray[tmpIndex] = data[leftStart];
                        leftStart++;
                    }
                }
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
