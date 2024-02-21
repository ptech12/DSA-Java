import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        /* create HashMap */
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), 1);
        }
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), 1);
        }

        if (sMap.size() <= 1 && tMap.size() <= 1) {
            // return false;
        }
        // System.out.println();

        System.out.println(sMap);
        System.out.println(tMap);
        System.out.println(sMap.equals(tMap));


        scanner.close();
    }
}

/* 
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

 

Constraints:

    1 <= s.length, t.length <= 5 * 104
    s and t consist of lowercase English letters.

 */
