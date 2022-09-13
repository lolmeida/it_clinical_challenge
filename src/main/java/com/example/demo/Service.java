package com.example.demo;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Character.isUpperCase;

public class Service {
    public String candidatura(String string, int n) {
        StringBuilder result = new StringBuilder();
        if (n <= 0) return result.toString();

        String regExp = "^[^A-Z\\d<>{}\"/|;:.,~!?@#$%^=&*\\]\\\\()\\[¿§«»ω⊙¤°℃℉€¥£¢¡®©_+]*$";

        for (int j = n - 1; j < string.length(); j += n) {
            char str = string.charAt(j);
            boolean yesNo = !String.valueOf(str).matches(regExp);
            if (yesNo) {
                result.append(str);
            }

        }
        if (isUpperCase(string.charAt(string.length() - 1))) {
            StringBuilder res = new StringBuilder();
            List<String> list = List.of(result.toString().split("")).stream().distinct().toList();
            for (String i : list) {
                res.append(i).append(" = ").append(Collections.frequency(Arrays.stream(string.split("")).toList(), i)).append("\n");

            }

            result = new StringBuilder(res.toString());
        }

        System.out.println(result);

        return result.toString();
    }
}
