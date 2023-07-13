public class day6 {
    
}

class Solution_6_1 {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l + 1];
        boolean flag = false;
        for(int i = 0; i < l; i++){
            if(i == l - 1){
                if(num_list[i - 1] < num_list[i])
                    flag = true;
            }
            answer[i] = num_list[i];
        }
        answer[l] = flag ? num_list[l - 1] - num_list[l - 2] : num_list[l - 1] * 2;
        return answer;
    }
}

class Solution_6_2 {
    public int solution(int n, String control) {
        int answer = n;
        int l = control.length();
        for(int i = 0; i < l; i++){
            char c = control.charAt(i);
            if(c == 'w')
                answer += 1;
            else if(c == 's')
                answer -= 1;
            else if(c == 'd')
                answer += 10;
            else if(c == 'a')
                answer -= 10;
        }
        return answer;
    }
}

class Solution_6_3 {
    public String solution(int[] numLog) {
        String answer = "";
        int l = numLog.length;
        for(int i = 0; i < l - 1; i++){
            int tmp = numLog[i + 1] - numLog[i];
            if(tmp == 1)
                answer += "w";
            else if(tmp == -1)
                answer += "s";
            else if(tmp == 10)
                answer += "d";
            else if(tmp == -10)
                answer += "a";
        }
        return answer;
    }
}

class Solution_6_4 {
    public int[] solution(int[] arr, int[][] queries) {
        int l1 = arr.length, l2 = queries.length;
        int[] answer = new int[l1];
        for(int i = 0; i < l1; i++)
            answer[i] = arr[i];
        for(int i = 0; i < l2; i++){
            int a = queries[i][0], b = queries[i][1];
            int tmp = answer[a];
            answer[a] = answer[b];
            answer[b] = tmp;
        }
        return answer;
    }
}

class Solution_6_5 {
    public int[] solution(int[] arr, int[][] queries) {
        int l1 = arr.length, l2 = queries.length;
        int[] answer = new int[l2];
        for(int j = 0; j < l2; j++){
            int f = queries[j][0], t = queries[j][1], k = queries[j][2];
            int tmp = k;
            for(int i = f; i <= t; i++){
                if(arr[i] > k){
                    if(tmp == k || tmp > arr[i])
                        tmp = arr[i];
                }
            }
            if(tmp == k)
                tmp = -1;
            answer[j] = tmp;
        }
        return answer;
    }
}