package basic.BasicAlgorithm;

public class BubbleSort {
    /**
     *      버블정렬(BubbleSort)
     *      두 인접한 배열요소를 차례대로 검사를 하여 정렬하는 방식
     *
     *      정렬방식
     *      1. 배열의 가장 앞에서 인접한 두 개의 여소에 대하여 비교(배열의 첫 번째 요소와 두번째 요소)
     *      2. 배열의 다음 인접한 요소(두 번째와 세번째를 비교)
     *      3. 배열을 끝까지 반복. 한 사이클이 끝나면 배열의 맨끝에는 정렬된 요소 하나가 정렬이 된채 자리잡는다.
     *      4. 정렬이 된 마지막 요소를 제외한 나머지에 대하여 1,2,3 과정을 반복
     *
     *      특징
     *      1. 시간복잡도는 O(n^2)로 느린편
     *      2. 코드 구현이 간단하다.
     *
     */

    public int[] bubbleSort(int[] data, int num){
        int tmp;
        for(int i = 0; i<num-1;i++){
            for(int j = 0; j<num-2; j++){
                if(data[j] > data[j+1]){
                    tmp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = tmp;
                }
            }
        }
        return data;
    }
}
