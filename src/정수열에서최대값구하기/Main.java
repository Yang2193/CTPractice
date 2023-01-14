package 정수열에서최대값구하기;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            int[] numbers = {1,2,3,4,5};
            int[] arr = new int[numbers.length];
        int tmp = 0;

        for (int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i] > arr[j]){

                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp; // swap, 값을 뒤집는 작업.
                }
            }
        }

            int answer = arr[0]*arr[1];
            System.out.println(answer);
        }
    }

