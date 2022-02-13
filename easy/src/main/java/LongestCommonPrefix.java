package main.java;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] stringArr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(stringArr));
    }


    public static String longestCommonPrefix(String[] arr) {
        String longestCommonPrefix = arr[0];
        for (int index = 1; index < arr.length; index++) {
            longestCommonPrefix = longestCommonPrefix(longestCommonPrefix, arr[index]);
        }
        return longestCommonPrefix;
    }

    private static String longestCommonPrefix(String longestCommonPrefix, String str) {
        StringBuilder res = new StringBuilder();
        for (int prefixIndex = 0, strIndex = 0;
             prefixIndex < longestCommonPrefix.length() && strIndex < str.length();
             prefixIndex++, strIndex++) {
            if (longestCommonPrefix.charAt(prefixIndex) != str.charAt(strIndex)) {
                break;
            }
            res.append(longestCommonPrefix.charAt(prefixIndex));
        }
        return res.toString();
    }

}
