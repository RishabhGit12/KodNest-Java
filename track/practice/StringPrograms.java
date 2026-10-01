package track.practice;

import java.util.*;

public class StringPrograms {

    public static void main(String[] args) {

        String s1 = "banana";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int cnt = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (ch == s1.charAt(j)) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println("First Non Repeating Character: " + ch);
                break;
            }
        }

        String s2 = "ananas";
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            hm.put(s2.charAt(i), hm.getOrDefault(s2.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (hm.get(s2.charAt(i)) == 1) {
                System.out.println("First Non Repeating Character: " + s2.charAt(i));
                break;
            }
        }

    }
}
