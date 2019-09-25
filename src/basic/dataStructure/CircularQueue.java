package basic.dataStructure;

public class CircularQueue {
    /**
     *      원형큐(CircularQueue)
     *
     *      원형큐는 선형큐의 문제점을 보완하기 위한 자료구조
     *      선형큐의 문제점은 rear가 가르키는 포인터가 배열의 마지막 인덱스를 가르키고 있을 때 압쪽에서 DeQueue로 발생한 빈 공간을 활용 할 수 없었음
     *      원형큐 에서는 포인터 증가 방식이 (rear+1)%arraysize 형식으로 변환하기 때문에 배열의 첫 인덱스부터 다시 데이터 삽입이 가능
     *
     *
     *      Enqueue
     *      rear의 포인터를 1증가 시키고 그 위치에 데이터 삽입이 이루어짐
     *      만약 rear+1이 배열의 끝이고 포화상태가 아니라면 배열의 첫 번째 인덱스에 데이터를 삽입
     *      -> 배열의 포화상태 여부를 판단하기 위하여 배열의 1칸은 비워둔다 (rear+1)%arraysize == front 라면 배열이 포화상태인것으로 판단
     *         데이터 삽입이 이루어지지않음
     *
     *     DeQueue
     *     front의 포인터를 1증가 시키고 그 위치의 데이터를 배열에서 가지고온다 rear == front 조건이라면 배열이 공백상태인것으로 판단 Dequeue가 실행되지 않는다.
     */

    int rear  = 0;
    int front = 0;
    int maxSize = 0;
    int[] circularQueue;

    public CircularQueue(int maxSize){
        this.maxSize = maxSize;
        circularQueue = new int[maxSize];
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public boolean isFull(){
        return (rear+1)%maxSize == front;
    }

    public void enQueue(int num){
        if(isFull()){
            System.out.println("Full Queue");
        }else{
            rear = (rear +1)%maxSize;
            circularQueue[rear] = num;
        }
    }

    public int deQueue(){
        if(isEmpty()){
            return -1;
        }else{
            front = (front + 1) %maxSize;
            return circularQueue[front];
        }
    }

    public static void main(String[] args){
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.enQueue(4);
        circularQueue.enQueue(3);
        circularQueue.enQueue(2);
        circularQueue.enQueue(1);

        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
    }
}
