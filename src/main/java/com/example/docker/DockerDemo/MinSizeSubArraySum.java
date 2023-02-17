package com.example.docker.DockerDemo;

public class MinSizeSubArraySum {

    public static void main(String[] args) {


        int[] array = {2,3,1,2,4,3};
        int target = 7;

        System.out.println(minSubArrayLen(target,array));
    }


    public static  int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while (sum>=target){
                minLength = Math.min(minLength,i-start+1);
              sum-= nums[start++];
            }
        }
        return minLength;
    }
}
