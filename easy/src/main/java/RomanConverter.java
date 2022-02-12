package main.java;

public class RomanConverter {
    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));
    }

    public static int romanToInt(String str) {
        int index = 0;
        int sum = 0;
        while (index < str.length()) {
            int num = 0;
            if (str.charAt(index) == 'I') {
                num = 1;
                if (index + 1 < str.length() && str.charAt(index + 1) == 'V') {
                    num = 4;
                    index++;
                } else if (index + 1 < str.length() && str.charAt(index + 1) == 'X') {
                    num = 9;
                    index++;
                }
            } else if (str.charAt(index) == 'C') {
                num = 100;
                if (index + 1 < str.length() && str.charAt(index + 1) == 'D') {
                    num = 400;
                    index++;
                } else if (index + 1 < str.length() && str.charAt(index + 1) == 'M') {
                    num = 900;
                    index++;
                }
            } else if (str.charAt(index) == 'X') {
                num = 10;
                if (index + 1 < str.length() && str.charAt(index + 1) == 'L') {
                    num = 40;
                    index++;
                } else if (index + 1 < str.length() && str.charAt(index + 1) == 'C') {
                    num = 90;
                    index++;
                }
            } else if (str.charAt(index) == 'V') {
                num = 5;
            } else if (str.charAt(index) == 'L') {
                num = 50;
            } else if (str.charAt(index) == 'D') {
                num = 500;
            }  else if (str.charAt(index) == 'M') {
                num = 1000;
            }


            sum += num;
            index++;
        }
        return sum;
    }
}