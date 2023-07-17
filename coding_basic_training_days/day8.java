public class day8 {
    
}

class Solution_8_1 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1||x2)&&(x3||x4);
    }
}

class Solution_8_2 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a == b && a == c && a == d){
            answer = 1111 * a;
        }
        else if(a == b && a == c){
            answer = (10 * a + d) * (10 * a + d);
        }
        else if(a == b && a == d){
            answer = (10 * a + c) * (10 * a + c);
        }
        else if(a == c && a == d){
            answer = (10 * a + b) * (10 * a + b);
        }
        else if(b == c && b == d){
            answer = (10 * b + a) * (10 * b + a);
        }
        else if(a == b && c == d){
            answer = (a + c) * Math.abs(a - c);
        }
        else if(a == c && b == d){
            answer = (a + b) * Math.abs(a - b);
        }
        else if(a == d && b == c){
            answer = (a + b) * Math.abs(a - b);
        }
        else if(a == b){
            answer = c * d;
        }
        else if(a == c){
            answer = d * b;
        }
        else if(a == d){
            answer = c * b;
        }
        else if(b == c){
            answer = a * d;
        }
        else if(b == d){
            answer = c * a;
        }
        else if(c == d){
            answer = a * b;
        }
        else{
            answer = a;
            if(answer > b)
                answer = b;
            if(answer > c)
                answer = c;
            if(answer > d)
                answer = d;
        }
        
        return answer;
    }
}

class Solution_8_3 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        int l = index_list.length;
        for(int i = 0; i < l; i++){
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }
}

class Solution_8_4 {
    public int solution(String number) {
        int answer = 0;
        int l = number.length();
        for(int i = 0; i < l; i++)
            answer += (int)(number.charAt(i) - '0');
        return answer % 9;
    }
}

class Solution_8_5 {
    public String solution(String my_string, int[][] queries) {
        int l1 = my_string.length(), l2 = queries.length;
        for(int j = 0; j < l2; j++){
            int s = queries[j][0], e = queries[j][1];
            String tmp = "";
            for(int i = 0; i < s; i++)
                tmp += my_string.charAt(i);
            for(int i = e; i >= s; i--)
                tmp += my_string.charAt(i);
            if(e < l1){
                for(int i = e + 1; i < l1; i++)
                    tmp += my_string.charAt(i);
            }
            my_string = tmp;
        }
        return my_string;
    }
}