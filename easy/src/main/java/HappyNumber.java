package main.java;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(10));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n))
                return false;
            set.add(n);
            String s = String.valueOf(n);
            int sum = 0;
            for (int index = 0; index < s.length(); index++) {
                sum += Math.pow(Integer.parseInt(String.valueOf(s.charAt(index))), 2);
            }
            n = sum;
        }
        return true;
    }
}
