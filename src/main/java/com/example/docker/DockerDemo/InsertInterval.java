package com.example.docker.DockerDemo;

import java.util.Arrays;
import java.util.LinkedList;

public class InsertInterval {

    public static void main(String[] args) {


        int[][] array = {{1,2},{3,5},{6,7},{8,10},{12,16}};

        int[] newInterval = {4,8};

        int[][] result = insert(array,newInterval);
        for(int[] interval : result){
            System.out.println(interval[0]+" "+interval[1]);
        }

    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {

        LinkedList<int[]> list = new LinkedList<>();

        for(int[] interval : intervals){
            if(newInterval[0]>interval[1]){
                list.add(interval);
            }else{
                newInterval[0] = Math.min(newInterval[0],interval[0]);
                        newInterval[1]=Math.max(interval[1],newInterval[1]);
                       // list.add(newInterval);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
