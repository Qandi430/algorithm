package basic.BasicAlgorithm;

public class SelectionSort {
    /**
     *      선택 정렬(SelectionSort)
     *      기존 위치에 맞는 원소를 선택하여 교환하는 방식
     *
     *      정렬 방식
     *      1. 아직 정렬이 안된 리스트 중에 가장 앞에 원소를 최초 값으로 설정
     *      2. 가장 앞에 원소를 제외한 나머지 원소를 차례로 비교하여 최고값을 찾아감
     *      3. 리스트 끝까지 비교 후 찾은 값의 최소값을 가장 앞에 원소와 교환
     *      4. 정렬이 안된 원소들을 가지고 반복
     *
     *      특징
     *      - 최소값을 찾기위한 비교 횟수는 많지만 교환횟수는 적다.
     *      - 데이터의 개수가 적을 때 좋은 성능을 발휘한다.
     *      - 시간복잡도 : O(n^2)
     */



    public int[] selectionSord(int[] data, int num){
        int min,tmp;
        for(int i=0;i<num-1;i++){
            min = i;
            for(int j = i+1; j<num; j++){
                if(data[min] > data[j])min = j;
                tmp = data[min];
                data[min] = data[i];
                data[i] = tmp;
            }
        }
        return data;
    }
}
