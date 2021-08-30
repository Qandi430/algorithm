package Programers.Level1;

public class Question12977 {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,4};
        System.out.println(solution(nums1));
        int[] nums2 = {1,2,7,6,4};
        System.out.println(solution(nums2));
    }
    public static int solution(int[] nums){
        int answer = 0;
        //step1 = 숫자 세개의 합;
        //step2 = 소수 체크;
        System.out.println("start");
        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1;j++){
                for(int k = j+1;k<nums.length; k++){
                    boolean prime = true;
                    int sum = nums[i]+nums[j]+nums[k];
                    System.out.println("a: "+nums[i]+",b: "+nums[j]+".c: "+nums[k]+", a+b+c="+sum);
                    for(int l = 2; l<=sum-1; l++){
                        System.out.println(sum+"%"+l+"="+sum%l);
                        if(sum % l == 0){
                            System.out.println("소수 아님");
                            prime = false;
                            break;
                        }
                    }
                    if(prime) ++answer;
                }
            }
        }
        return answer;
    }
}
