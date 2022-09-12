package com.example.demo;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isUpperCase;

public class ItClinic {
    public String problem(String string, int n) {
        StringBuilder result = new StringBuilder();
        String regExp = "^[^A-Z\\d<>{}\"/|;:.,~!?@#$%^=&*\\]\\\\()\\[¿§«»ω⊙¤°℃℉€¥£¢¡®©_+]*$";

        // Given "ITCLiNicAl" and N = -1, the return value will be "";
        if (n <= 0) return result.toString();

        for (int j = n - 1; j < string.length(); j += n) {
            char charOfString = string.charAt(j);
            boolean yesNo = !String.valueOf(charOfString).matches(regExp);
            if (yesNo) result.append(charOfString);
        }

        /*
        Optional Task 2:
        Service prints a count of each type of character returned.
         */
        if (isUpperCase(string.charAt(string.length() - 1))) {
            StringBuilder res = new StringBuilder();
            List<String> list = Stream.of(result.toString().split("")).distinct().toList();
            for (String i : list) {
                res.append(i).append(" = ").append(Collections.frequency(Arrays.stream(string.split("")).toList(), i)).append("\n");
            }

            result = new StringBuilder(res.toString());
        }
        return result.toString();
    }
}
