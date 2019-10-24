package backjoon.ch13;

import java.io.*;

public class Question2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cntLope = Integer.parseInt(br.readLine());
        int[] lopes = new int[cntLope];
        int maxWeight = 0;

        for(int i = 0; i< cntLope; i++){
            lopes[i] = Integer.parseInt(br.readLine());
        }

        lopes = mergeSort(lopes,0,lopes.length-1);

        for(int i = cntLope-1; i >= 0; i--){
            if(maxWeight < lopes[i]*(i+1)){
                maxWeight = lopes[i]*(i+1);
            }
            if(maxWeight >= 10000){
                maxWeight = 10000;
                break;
            }
        }

        System.out.println(maxWeight);
    }

    public static int[] mergeSort(int[] data, int first, int last){
        if(last>first){
            int middle = (first+last)/2;
            mergeSort(data,first,middle);
            mergeSort(data,middle+1,last);
            sort(data,first,middle,last);
        }
        return data;
    }

    public static void sort(int[] data,int first,int middle,int last){
        int[] tmpArray = new int[data.length]; //합병 정렬 임시 저장
        int leftStart = first;        //분열된 왼쪽배열 시작
        int tmpIndex = first;         //합병되는 배열의 시작
        int rightStart = middle+1;    //분열된 오른쪽 배열 시작

        while(leftStart <= middle && rightStart<=last){     //왼쪽 배열과 오른쪽 배열차례대로 비교하여 임시배열에 넣기
            if(data[leftStart] > data[rightStart]){         //왼쪽 배열의 원소가 작을 경우
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
