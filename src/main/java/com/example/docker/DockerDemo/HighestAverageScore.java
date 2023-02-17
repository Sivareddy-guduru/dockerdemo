package com.example.docker.DockerDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestAverageScore {
    public static void main(String[] args) {
        String scores[][] = null;
               // {{"jerry","65"},{"bob","91"}, {"jerry","23"}, {"Eric","83"}};

        System.out.println(highestAverageScore(scores));
}

    public  static String highestAverageScore(String[][] scores)
    {
        if(null == scores || scores.length ==0) return "";
      int length = scores.length;

        Map<String, List<String>> map = new HashMap<>();

        for(int i=0;i<length;i++){
            String[] score = scores[i];
            List<String> list = map.getOrDefault(score[0],new ArrayList<>());
            list.add(score[1]);
            map.put(score[0],list);
        }

        double avg = 0;
        String stu = "";

        for(String key : map.keySet()){

            List<String> list = map.get(key);
             double localAvg = list.stream().mapToDouble(x->Double.valueOf(x)).average().getAsDouble();
             if(localAvg>avg){
                 stu = key;
                 avg = localAvg;
             }

        }
        return stu;
    }
}
