import java.util.Arrays;

public class day13 {
    
}

class Solution_13_1 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return answer;
    }
}

class Solution_13_2 {
    public int[] solution(int[] num_list, int n) {
        int l = num_list.length;
        int[] answer = new int[l];
        int tmp = 0;
        for(int i = n; i < l; i++)
            answer[tmp++] = num_list[i];
        for(int i = 0; i < n; i++)
            answer[tmp++] = num_list[i];
        return answer;
    }
}

class Solution_13_3 {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int l1 = str_list.length;
        int flag = 0, i = 0;
        for(i = 0; i < l1; i++){
            if(str_list[i].equals("l")){
                flag = 1;
                break;
            }
            else if(str_list[i].equals("r")){
                flag = 2;
                break;
            }
        }
        
        if(flag == 1){
            answer = Arrays.copyOfRange(str_list, 0, i);
        }
        else if(flag == 2){
            answer = Arrays.copyOfRange(str_list, i + 1, l1);
        }
        return answer;
    }
}

class Solution_13_4 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i = 0; i < n; i++)
            answer[i] = num_list[i]; 
        return answer;
    }
}

class Solution_13_5 {
    public int[] solution(int[] num_list, int n) {
        int l3 = num_list.length;
        int[] answer = new int[l3 % n == 0 ? (int) l3 / n : (int)(l3 / n) + 1];
        int tmp = 0;
        for(int i = 0; i < l3; i += n)
            answer[tmp++] = num_list[i];
        return answer;
    }
}