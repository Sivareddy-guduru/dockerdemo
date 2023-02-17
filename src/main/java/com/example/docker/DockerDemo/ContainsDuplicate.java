package com.example.docker.DockerDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
  int[] array = {1,2,3,4};
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {

     //  c   3r2  BV
     return false;
    }
}
