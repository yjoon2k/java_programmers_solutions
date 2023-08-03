public class day23 {
    
}

class Solution_23_1 {
    public int solution(String str1, String str2) {
        if(str2.contains(str1))
            return 1;
        else
            return 0;
    }
}

class Solution_23_2 {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; i++){
            if(!str_list[i].contains(ex))
                answer += str_list[i];
        }
        return answer;
    }
}

class Solution_23_3 {
    public int solution(int[] num_list, int n) {
        for(int i = 0; i < num_list.length; i++)
            if(num_list[i] == n)
                return 1;
        return 0;
    }
}

class Solution_23_4 {
    public int solution(int a, int b) {
        if(a % 2 == 1 && b % 2 == 1)
            return a * a + b * b;
        else if(a % 2 == 0 && b % 2 == 0)
            return a > b ? a - b : b - a;
        else
            return 2 * (a + b);
    }
}

class Solution_23_5 {
    public int solution(int[] date1, int[] date2) {
        for(int i = 0; i < 3; i++){
            if(! (date1[i] == date2[i]))
                return date1[i] < date2[i] ? 1 : 0;
        }
        return 0;
    }
}