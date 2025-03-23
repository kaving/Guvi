import java.util.LinkedHashSet;
import java.util.Set;

package com.org;

public class FirstUniqueChar {
    
    public static char firstUniqueChar(String str) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> duplicateChars = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (duplicateChars.contains(c)) {
                continue;
            }
            if (uniqueChars.contains(c)) {
                uniqueChars.remove(c);
                duplicateChars.add(c);
            } else {
                uniqueChars.add(c);
            }
        }

        return uniqueChars.iterator().hasNext() ? uniqueChars.iterator().next() : '\0';
    }

    public static void main(String[] args) {
        String str = "leetcode";
        char result = firstUniqueChar(str);
        System.out.println("First unique character: " + result);
    }
}
