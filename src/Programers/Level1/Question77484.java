package Programers.Level1;

public class Question77484 {
    public static void main(String[] args){
        System.out.println(7-6);
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        System.out.println(solution(lottos1,win_nums1));
        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        System.out.println(solution(lottos2,win_nums2));
        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};
        System.out.println(solution(lottos3,win_nums3));
    }

    public static int[] solution(int[] lottos, int[] win_nums){
        int[] answer = new int[2];
        int zero = 0;
        int collect = 0;
        for(int i = 0; i<lottos.length; i ++){
            if(lottos[i] == 0){
                zero += 1;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    collect +=1;
                    continue;
                }
            }
        }
        System.out.println("zero : "+zero+" collect : "+collect);

        answer[0] = 7-(zero+collect) >= 6 ? 6 : 7-(zero+collect);
        answer[1] = (7-collect) >= 6 ? 6: 7-collect;

        System.out.println("max : "+answer[0]+" min : "+answer[1]);
        return answer;
    }
}
