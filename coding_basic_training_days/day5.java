public class day5 {
    
}

class Solution_5_1 {
    public String solution(String code) {
        String answer = "";
        int l = code.length();
        boolean mode = false;
        for(int i = 0; i < l; i++){
            if(code.charAt(i) == '1'){
                mode = !mode;
                continue;
            }
            if(!mode && i % 2 == 0){
                answer += code.charAt(i);
            }
            else if(mode && i % 2 == 1){
                answer += code.charAt(i);
            }
        }
        if(answer.length() == 0)
            answer = "EMPTY";
        return answer;
    }
}

class Solution_5_2 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int l = included.length;
        int tmp = a;
        for(int i = 0; i < l; i++){
            if(included[i]){
                answer += tmp;
            }
            tmp += d;
        }
        return answer;
    }
}

class Solution_5_3 {
    public int solution(int a, int b, int c) {
        if(a == b && b == c)
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        else if(a == b || a == c || b == c)
            return (a + b + c) * (a * a + b * b + c * c);
        else
            return (a + b + c);
    }
}

class Solution_5_4 {
    public int solution(int[] num_list) {
        int m = 1;
        int s = 0;
        int l = num_list.length;
        for(int i = 0; i < l; i++){
            m *= num_list[i];
            s += num_list[i];
        }
        return m < s * s ? 1 : 0;
    }
}

class Solution_5_5 {
    public int solution(int[] num_list) {
        int tmp1 = 1, tmp2 = 1;
        int a1 = 0, a2 = 0;
        int l = num_list.length;
        for(int i = l - 1; i >= 0; i--){
            if(num_list[i] % 2 == 0){
                a2 += num_list[i] * tmp2;
                tmp2 *= 10;
            }
            else{
                a1 += num_list[i] * tmp1;
                tmp1 *= 10;
            }
        }
        return a1 + a2;
    }
}