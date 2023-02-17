package com.example.docker.DockerDemo;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4);
        System.out.println(findTotalPower(list));
    }


    public static int findTotalPower(List<Integer> power) {
        // Write your code here

        int size = power.size();
        int finalSum =0;
        int[] sumArray = buildSumMatrix(power,size);
       // int[] minArray = minArray(power,size);

        for( int i =0;i<size;i++){
            for( int j=i;j<size;j++){
                int sum =0;
                if(i>= 1) {
                     sum = sumArray[j] - sumArray[i-1];
                }else{
                    sum = sumArray[j];
                }

              finalSum += (min(power,i,j)*sum);
               // System.out.println(" i is "+i+"j is "+j+" sum"+finalSum);
            }
        }

        return finalSum%1000000007;
    }


    private static int[] buildSumMatrix(List<Integer> power,int size)
    {
        int sum = power.get(0);
        int[] array = new int[size-1];
        array[0] =  sum;

        for(int i=1;i<size;i++){
            sum += array[i-1] + power.get(i);
            array[i]= sum;
        }

        return array;
    }

    private static  int[] minArray(List<Integer> power,int size)
    {
       int[] array = new int[size-1];
       int min =power.get(0);
       array[0] =  min;
       for(int i=1;i<size;i++){
            min = Math.min(array[i-1],power.get(i));
            array[i] = min;
       }
        return array;
    }

    private static int min(List<Integer> power,int l, int r)
    {
        int min = power.get(l);
        for(int i=l+1;i<=r;i++){
            min = Math.min(min,power.get(i));
        }
        return min;
    }

    private static  int sum(List<Integer> power,int l, int r)
    {
       int sum =0;

       for(int i=l;i<=r;i++){
           sum += power.get(i);
       }
       return sum;
    }

}
