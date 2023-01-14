package 배열뒤집기;

import java.util.ArrayList;

public class Solution {
    public ArrayList solution(String[] strlist) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (String str : strlist) {
            answer.add(str.length());
        }

        return answer;
    }




 /*  내풀이  public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0 ; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }*/
}
