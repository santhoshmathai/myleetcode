package com.aju.windsor.codility;

import java.util.Arrays;
import java.util.Set;

public class CodeAnagram {

    public static void main(String... args){
        boolean flag = isAnagram("Trees", Set.of("Steer"));
        System.out.println(flag);
    }

    public static boolean isAnagram(String value, final Set<String> stringSet){
        boolean flag = false;
        for(String str: stringSet){
            if(checkAnagram(value, str)){
                flag = true;
            }
        }
        return flag;
    }

    private static boolean checkAnagram(String value, String setEntry){
        if(value.length() != setEntry.length()){
            return false;
        }
        char[] valueArray = value.toLowerCase().toCharArray();
        char[] setEntryArray = setEntry.toLowerCase().toCharArray();

        Arrays.sort(valueArray);
        Arrays.sort(setEntryArray);


        return Arrays.equals(valueArray, setEntryArray);
    }
}
