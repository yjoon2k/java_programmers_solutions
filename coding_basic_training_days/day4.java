public class day4 {
    
}

class Solution_4_2 {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}

class Solution_4_2 {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}

class Solution_4_3 {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){
            for(int i = 2; i <= n; i += 2){
                answer += i * i;
            }
        }
        else{
            for(int i = 1; i <= n; i += 2){
                answer += i;
            }
        }
        return answer;
    }
}

class Solution_4_4 {
    public int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals("<")){
            if(eq.equals("=")){
                return n <= m ? 1 : 0;
            }
                return n < m ? 1 : 0;
        }
        else{
            if(eq.equals("=")){
                return m <= n ? 1 : 0;
            }
                return m < n ? 1 : 0;
        }
    }
}

class Solution_4_5 {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}