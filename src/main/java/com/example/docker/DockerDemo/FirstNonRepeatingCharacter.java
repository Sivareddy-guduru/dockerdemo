package com.example.docker.DockerDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println(getFirstNonRepeatingCharacter("ajhdgj"));
    }


    public static Character getFirstNonRepeatingCharacter(String input)
    {
        HashMap<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<input.length();i++){
            map.put(input.charAt(i),map.getOrDefault(input.charAt(i),0)+1);
        }

        for(Character key : map.keySet()){
            if(map.get(key) == 1) return key;
        }

        return null;
    }
}
