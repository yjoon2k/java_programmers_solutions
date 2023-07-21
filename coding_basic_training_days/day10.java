public class day10 {
    
}

class Solution_10_1 {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}

class Solution_10_2 {
    public int solution(String my_string, String is_prefix) {
        if(my_string.length() < is_prefix.length())
            return 0;
        return my_string.substring(0, is_prefix.length()).equals(is_prefix) ? 1 : 0;
    }
}

class Solution_10_3 {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        answer += my_string.substring(0, s);
        String tmp = my_string.substring(s, e + 1);
        int l = e - s + 1;
        for(int i = l - 1; i >= 0; i--)
            answer += tmp.charAt(i);
        answer += my_string.substring(e + 1);
        return answer;
    }
}

class Solution_10_4 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int l1 = my_string.length();
        for(int i = c; i <= l1; i += m){
            answer += my_string.charAt(i - 1);
        }
        return answer;
    }
}

class Solution_10_5 {
    public String solution(int q, int r, String code) {
        String answer = "";
        int l2 = code.length();
        for(int i = r; i < l2; i += q)
            answer += code.charAt(i);
        return answer;
    }
}