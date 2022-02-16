package main.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyzva";
        String t = "abcdefghijklmnopqrstuvwxyzck";
        System.out.println(isIsomorphic(s, t));

    }

    public static boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }

    private static String transformString(String string) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < string.length(); index++) {
            if (!map.containsKey(string.charAt(index))) {
                map.put(string.charAt(index), index);
            }
            builder.append(map.get(string.charAt(index))+" ");
        }
        return builder.toString();
    }
}
