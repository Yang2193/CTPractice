package 배열인덱스로잘라출력;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1); // Arrays를 사용한 풀이.
    }
   /* public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers[num1 + i];
        }
        return answer;
    }*/ // 내 풀이

}
