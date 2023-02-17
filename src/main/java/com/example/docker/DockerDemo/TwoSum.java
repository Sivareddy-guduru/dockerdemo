package com.example.docker.DockerDemo;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
      int[] array = {2,7,11,15};
      int[] result = twoSum(array,9);
        System.out.println(result[0]+" "+result[1]);


    }

    public static int[] twoSum(int[] array,int sum)
    {
        int length = array.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<length;i++){
            if(map.containsKey(sum-array[i])){
                return new int[]{map.get(sum-array[i]),i};
            }else{
                map.put(array[i],i);
            }
        }

        return new int[]{-1,-1};

    }
}
