package com.example.testcode.tests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AlphabetUtil {

    /**
     * For a given string that only contains alphabet characters a-z, if 3 or more consecutive
     * characters are identical, remove them from the string. Repeat this process until
     * there is no more than 3 identical characters sitting besides each other.
     *
     * @param alphabetStr
     */
    public static void removeIdenticalAlphabets(String alphabetStr) {
        if (alphabetStr.length() < 3) {
            System.out.println(alphabetStr);
            return;
        }
        AlphabetInfo info = new AlphabetInfo();
        info.setAlphabetStr(alphabetStr);
        Set<String> charSet = new HashSet(Arrays.asList(alphabetStr.split("")));

        charSet.forEach(c -> {
            StringBuilder regex = new StringBuilder(c + c + c);
            if (alphabetStr.contains(regex)) {
                info.setAlphabetStr(alphabetStr.replace(regex, ""));
                System.out.println(info.getAlphabetStr());
                if (info.getAlphabetStr().length() > 2) {
                    removeIdenticalAlphabets(info.getAlphabetStr());
                }
            }
        });
    }

    /**
     * #Stage 2 - advanced requirement
     * Instead of removing the consecutively identical characters, replace them with a
     * single character that comes before it alphabetically
     *
     * @param alphabetStr
     */
    public static void replaceIdenticalAlphabets(String alphabetStr) {
        if (alphabetStr.length() < 3) {
            System.out.println(alphabetStr);
            return;
        }
        AlphabetInfo info = new AlphabetInfo();
        info.setAlphabetStr(alphabetStr);
        Set<String> charSet = new HashSet(Arrays.asList(alphabetStr.split("")));

        charSet.forEach(c -> {
            StringBuilder regex = new StringBuilder(c + c + c);
            if (alphabetStr.contains(regex)) {
                Character alphabet = (char) (c.charAt(0) - 1);
                String replacement = alphabet.toString();
                if (alphabet < 'a') {
                    replacement = "";
                }
                info.setAlphabetStr(alphabetStr.replace(regex, replacement));
                System.out.println(info.getAlphabetStr());
                if (info.getAlphabetStr().length() > 2) {
                    replaceIdenticalAlphabets(info.getAlphabetStr());
                }
            }
        });
    }
}
