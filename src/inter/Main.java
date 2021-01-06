package inter;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static String BiggestSubString(String s) {
        String biggestSub = "";
        for (int i = 0; i < s.length(); i++) {
            Set<Character> characters = new HashSet<>();
            int j;
            for (j = i; j < s.length(); j++) {
                if (characters.contains(s.charAt(j))) {
                    break;
                } else {
                    characters.add(s.charAt(j));
                }
            }
            if (biggestSub.length() < j - i + 1) {
                biggestSub = s.substring(i, j);
            }
        }
        return biggestSub;
    }

    public static void main(String[] args) {

        String s1 = "java_java_java_java";
        System.out.println(BiggestSubString(s1));
        String s2 = "java_language_is_sweet";
        System.out.println(BiggestSubString(s2));
        String s3 = "abcabcbb";
        System.out.println(BiggestSubString(s3));
    }
}
