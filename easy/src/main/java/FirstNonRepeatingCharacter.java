package main.java;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabb";
        System.out.println(firstUniqChar(str));
    }

    private static int firstUniqChar(String str) {
        int[] count = new int[256];
        for (int index = 0; index < str.length(); index++) {
            count[str.charAt(index)]++;
        }
        int firstUniqueCharIndex = -1;
        for (int index = 0; index < str.length(); index++) {
            if (count[str.charAt(index)] == 1) {
                firstUniqueCharIndex = index;
                break;
            }
        }
        return firstUniqueCharIndex;
    }
}
