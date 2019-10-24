package backjoon.ch16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deck deck = new Deck(n);
        System.out.println(deck.toString());
        int index = 0;
        while (deck.getRear() != deck.getFront()){
            deck.draw();
            System.out.println((++index)+" = "+deck.toString());
        }
        System.out.println(deck.getLast());
    }
}
class Deck{
    @Override
    public String toString() {
        return "Deck{" +
                "cardList=" + Arrays.toString(cardList) +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }

    int[] cardList;
    int front = 0;
    int rear;

    public Deck(int n){
        cardList = new int[n];

        for(int i = 0; i<cardList.length; i++){
            cardList[i] = i+1;
        }
        rear = n-1;
    }

    void draw(){
        int temp = cardList[1];
        for(int i = 2; i<=rear; i++){
            cardList[i-2] = cardList[i];
        }
        cardList[rear] = 0;
        cardList[--rear] = temp;
    }

    int getFront(){
        return front;
    }

    int getRear(){
        return rear;
    }

    int getLast(){
        return cardList[front];
    }
}
