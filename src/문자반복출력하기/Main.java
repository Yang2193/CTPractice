package 문자반복출력하기;

public class Main {
    public static void main(String[] args) {
        String str = "hello";
        String answer = "";
        int n = 2;
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < n; j++){
                answer = answer + (str.charAt(i));
            }
        }
        System.out.println(answer);
    }
}
