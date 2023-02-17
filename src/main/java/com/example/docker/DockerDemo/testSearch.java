package com.example.docker.DockerDemo;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testSearch {

    public static void main(String[] args) {

       // int sum = Stream.iterate(int int[]{0,1},x->new int[]{x[1],x[0]+x[1]})
       // Test a = a->a.le


    }

    interface Test{
        int aMthod(String s);
    }

    public List<List<String>> getPr(List<String> products, String search)
    {

        List<List<String>> resukt = new ArrayList<>();
     int n = search.length();

     for(int i=0;i<n;i++){
         String substring = search.substring(0,i+1);

         List<String> current = products.stream().filter(x->x.startsWith(substring)).sorted().limit(3).collect(Collectors.toList());
               resukt.add(current);

     }

     return resukt;

    }
}
