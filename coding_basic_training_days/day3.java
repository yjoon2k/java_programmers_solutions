public class day3 {
    
}

class Solution_3_1 {
    public String solution(String str1, String str2) {
        String answer = "";
        int l = str1.length();
        for(int i = 0; i < l; i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}

class Solution_3_2 {
    public String solution(String[] arr) {
        String answer = "";
        int l = arr.length;
        for(int i = 0; i < l; i++){
            answer += arr[i];
        }
        return answer;
    }
}

class Solution_3_3 {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
    }
}

class Solution_3_4 {
    public int solution(int a, int b) {
        int A = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int B = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return A > B ? A : B;
    }
}

class Solution_3_5 {
    public int solution(int a, int b) {
        int A = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int B = 2 * a * b;
        return A > B ? A : B;
    }
}