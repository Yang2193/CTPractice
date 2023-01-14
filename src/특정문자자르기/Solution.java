package 특정문자자르기;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replaceAll(letter,"");
        return answer;
    }

}
