package com.example.docker.DockerDemo;

public class KathSnallestElement {

    public static void main(String[] args) {
      int [] array = {4,8, 9, 2, 1, 1};
        System.out.println(kthSmallestElement(array,2));
    }

    public static int kthSmallestElement(int[] array, int k)
    {
             for(int i=0;i<k;i++){
                 int min = array[i];
                 int minIndex = i;
                 for(int j=i;j<array.length;j++){
                     if(array[j]<min){
                         min = array[j];
                         minIndex = j;
                     }
                 }
                 int temp = array[i];
                 array[i] = min;
                 array[minIndex] = temp;
             }

             return array[k-1];
    }
}
