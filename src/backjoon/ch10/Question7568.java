package backjoon.ch10;

import java.util.Scanner;

public class Question7568 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] grades = new int[n];
        String[] person = new String[n];
        int weight,weight2,height,height2;
        for(int i = 0; i< n; i++){
            person[i] = sc.nextLine();
            grades[i] = 1;
        }

        for(int i = 0; i< n; i++){
            weight = Integer.parseInt(person[i].split(" ")[0]);
            height = Integer.parseInt(person[i].split(" ")[1]);
            for(int j = 0; j<n; j++){
                if(i == j) continue;
                weight2 = Integer.parseInt(person[j].split(" ")[0]);
                height2 = Integer.parseInt(person[j].split(" ")[1]);
                if(weight < weight2){
                    if(height < height2){
                        grades[i] ++;
                    }
                }

            }
        }

        for(int g : grades){
            System.out.print(g+" ");
        }

    }
}
