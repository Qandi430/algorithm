package basic.BasicAlgorithm;

public class QuickSort {
    /**
     *      퀵정렬(Quick Sort)
     *      기준이 되는 원소를 기준으로 하여 기준 원소보다 작거나 같은 값을 지닌 자료는 앞으로
     *      큰값을 지닌 자료는 뒤로 가도록 하여 기준 원소를 중심으로 분할해가며 정렬을 진행하는 방식
     *
     *      정렬방식
     *      1. 기준이 되는 원소를 정한다. 배열의 시작원소를 pivot으로 설정
     *      2. 좌우 인덱스를 지정. 해당 인덱스는 다음을 의미한다.
     *          - left : pivot보다 큰 값을 찾으러 다니는 index
     *          - right : pivot보다 작은 값을 찾으러 다니는 index
     *          - left_hold : pivot을 제외하고 정렬대 상의 시작점
     *          - right_hold : pivot을 제외하고 정렬 대상의 끝점
     *      3. left를 pivot보다 큰 값을 찾을 때 까지 이동
     *      4. right를 pivot보다 큰 값을 찾을 때 까지 이동
     *      5. left <= right 조건이라면 두 원소를 스왑한다.
     *      6. 3번 4번 과정을 left <= right 만족할때까지 반복
     *      7. left와 right가 교차하게 되면 right위치에 pivot값을 대입
     *      8. right를 기준으로 분열된 배열에 대해서 퀵정렬을 반복
     *
     *      특징
     *      1. 최악의 경우 O(n^2) 비교를 수행하고 평균적으로 O(nlog n)번의 비교를  수행
     *      2. 제곱 시간이 걸릴 확률이 거의 없도록 알고리즘 걸계가 가능
     *      3. 다른 정렬 알고리즘에 비해 빠르게 동작 가능
     */

    public int[] quickSort(int[] data, int left, int right){
        int pivot_index = left;
        int pivot = data[pivot_index];
        int hold_left = left;
        int hold_right = right;

        left++;

        while(right >= left){
            while(left<=right && data[left]<=pivot){
                left++;
            }
            while (data[right] >= pivot && left <= right){
                right --;
            }
            if(left<=right){
                int tmp = data[left];
                data[left] = data[right];
                data[right] = tmp;
            }
        }
        int tmp = data[pivot_index];
        data[pivot_index] = data[right];
        data[right] = tmp;

        if(right > hold_left)
            data = quickSort(data,hold_left,right-1);
        if(hold_right > right)
            data = quickSort(data,right+1,hold_right);
        return data;
    }
}
