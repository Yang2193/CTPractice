package 문자열뒤집기;

public class Solution {
    /*public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1; i >= 0; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }*/ // 내 풀이
    public String solution(String my_string){
        StringBuilder sb = new StringBuilder(); // StringBuilder 라는 클래스를 객체화해서 불러온다.
        sb.append(my_string); // append(); ()안에 추가하고 싶은 문자열을 쓴다.
        sb.reverse(); // 문자열을 뒤집는 메소드

        return sb.toString(); //toString()은 객체가 가지고 있는 값을 문자열로 리턴하는 메서드
    }

}
