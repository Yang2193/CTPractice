package 정수열에서최대값구하기;

public class Solution {
    public int solution(int[] numbers) { //오름차순 정렬


        java.util.Arrays.sort(numbers);
        int max = numbers[numbers.length-1];
        int max2 = numbers[numbers.length-2];



        int answer = max*max2;
        return answer;
    }
    /*public int solution(int[] numbers) {


        java.util.Arrays.sort(numbers,Collections.reverseOrder());
        int max = numbers[0];
        int max2 = numbers[1];



        int answer = max*max2;
        return answer;
    }*/

    }

