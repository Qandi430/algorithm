package Programers.Level2;

import java.util.Arrays;
import java.util.DuplicateFormatFlagsException;

public class Question42583 {
    public static void main(String[] args){
        Question42583 question = new Question42583();
        System.out.println(question.solution(100,100,new int[]{10,10,10,10,10,10,10,10,10,10}));
//        System.out.println(solution(100,100,new int[]{10}));
//        System.out.println(solution(2,10,new int[]{7,4,5,6}));

    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Trucks wait = new Trucks(truck_weights.length);

        for(int i = 0; i<truck_weights.length; i++){
            wait.onTruck(new Truck(truck_weights[i]));
        }

        Trucks bridge = new Trucks(truck_weights.length,bridge_length,weight);
        while (true){
            answer++;
            bridge.addHour();
            if(wait.trucks[0] != null && bridge.getWeight()+wait.trucks[0].getWeight() <= weight){
                bridge.onTruck(wait.outTruck());
            }
            if(wait.trucks[0] == null && bridge.trucks[0] == null) break;
        }

        return answer;
    }
}
class Truck{
    int hour;
    int weight;

    public Truck(int weight){
        this.weight = weight;
        this.hour = 1;
    }

    public void addHour(){
        this.hour++;
    }

    public int getHour(){
        return this.hour;
    }

    public int getWeight(){
        return this.weight;
    }
}

class Trucks{
    int last = -1;
    int first = 0;
    int bridgeLength = 0;
    int maxWeight = 0;
    Truck[] trucks;

    public Trucks(int maxSize){
        this.trucks = new Truck[maxSize];
    }
    public Trucks(int maxSize,int bridgeLength,int maxWeight){
        this.trucks = new Truck[maxSize];
        this.bridgeLength = bridgeLength;
        this.maxWeight = maxWeight;
    }

    public void onTruck(Truck truck){
        trucks[++last] = truck;
    }

    public Truck outTruck(){
        if(first != last || (first != 0 && last != 0)){
            Truck out = trucks[first];
            for(int i = 1; i<trucks.length; i++){
                trucks[i-1] = trucks[i];
                trucks[i] = null;
            }
            last--;
            return out;
        }else{
            last = -1;
            Truck out = trucks[0];
            trucks[0] = null;
            return out;
        }
    }

    public Truck addHour(){
        Truck truck = null;
        for(Truck t : trucks){
            if(t != null) t.addHour();

        }
        for(Truck t : trucks){
            if(t != null && t.getHour() > bridgeLength) truck = this.outTruck();
        }
        return truck;
    }

    public int getWeight(){
        int weight = 0;
        for(Truck t : trucks){
            if(t != null) weight+=t.getWeight();
        }
        return weight;
    }
}