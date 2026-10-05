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

        //Find first unique character
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

        //Remove duplicate characters
        String s3 = "potato";
        int l1 = s3.length();
        Set<Character> hs = new HashSet<>();
        for (int i = 0; i < l1; i++) {
            hs.add(s3.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char c : hs) {
            sb.append(c);
        }
        System.out.println(sb);

        //Anagram
        String s4 = "silent";
        String s5 = "listen";
        int[] freqArr = new int[256];
        for (int i = 0; i < s4.length(); i++) {
            freqArr[s4.charAt(i)]++;
            freqArr[s5.charAt(i)]--;
        }
        for (int n : freqArr) {
            if (n != 0) {
                System.out.println("Not Anagrams");
            }
        }

        //Check whether one String is the rotation of another String
        String s6 = "abcd";
        String s7 = "cdab";
        String s8 = new String(s6 + s7);
        System.out.println("Ratation? : " + s8.contains(s7));

        String s9 = "createyourfuture";
        Map<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < s9.length(); i++) {
            hm2.put(s9.charAt(i), hm2.getOrDefault(s9.charAt(i), 0) + 1);
        }
        char maxFreqChar = ' ';
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> entry : hm2.entrySet()) {
            if (maxFreq < entry.getValue()) {
                maxFreqChar = entry.getKey();
                maxFreq = entry.getValue();
            }
        }
        System.out.println(maxFreqChar);

    }
}
