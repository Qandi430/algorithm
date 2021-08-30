package Programers.Level1;

import java.util.ArrayList;
import java.util.List;

public class Question1845 {
    public static void main(String[] args){
        int[] nums1 = {3,1,2,3};
        System.out.println(solution(nums1));
        int[] nums2 = {3,3,3,2,2,4};
        System.out.println(solution(nums2));
        int[] nums3 = {3,3,3,2,2,2};
        System.out.println(solution(nums3));
    }
    public static int solution(int[] nums){
        List<Integer> variable = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(!variable.contains(nums[i])) variable.add(nums[i]);
        }
        return nums.length/2 > variable.size() ? variable.size() : nums.length/2;
    }
}
