package basic.BasicAlgorithm;

public class InsertionSort {
    /**
     *      삽입정렬(Insertion Sort)
     *      자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부부과 비교하여
     *      자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘
     *
     *      정렬방식
     *      1. 배열의 첫 번째 요소는 정렬된 상태라고 가정한다.
     *      2. 배열의 두 번째 요소부터 앞에 정렬된 배열을 차례대로 비교하며 교환한다.
     *      3. 최종적으로 자신의 위치에 맞는 위치에 삽입된다.
     *      4. 다음 배열 요소에 대해서 같은 작업을 반복한다.
     *
     *      특징
     *      1. 비교적 작은 배열에 대해서는 효율이 좋다.
     *      2. 시간복잡도는 O(n^2)
     */

    public int[] insertionSort(int[] data, int num){
        int tmp,i,j;
        for(i = 1; i<data.length; i++){
            tmp = data[i];
            for(j = i-1; tmp>data[j] &&j>=0; j--){
                data[j+1] = data[j];
            }
            data[j+1] = tmp;
        }
        return data;
    }
}
