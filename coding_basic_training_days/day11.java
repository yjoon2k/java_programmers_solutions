import java.util.Arrays;

public class day11 {
    
}

class Solution_11_1 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer, 0);
        int l1 = my_string.length();
        for(int i = 0; i < l1; i++){
            char tmp = my_string.charAt(i);
            if((int)(tmp - 'A') >= 26)
                answer[(int)(tmp - 'a') + 26] += 1;
            else
                answer[(int)(tmp - 'A')] += 1;
        }
        return answer;
    }
}

class Solution_11_2 {
    public int[] solution(int n, int k) {
        int[] answer = new int[(int) n / k];
        for(int i = 1; i <= (int) n / k; i++)
            answer[i - 1] = k * i;
        return answer;
    }
}

class Solution_11_3 {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.parallelSort(indices);
        int l2 = my_string.length(), tmp = 0, l3 = indices.length;
        for(int i = 0; i < l2; i++){
            if(tmp < l3 && indices[tmp] == i){
                tmp++;
                continue;
            }
            answer += my_string.charAt(i);
        }
        return answer;
    }
}

class Solution_11_4 {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        for(int i = start; i >= end; i--)
            answer[start - i] = i;
        return answer;
    }
}

class Solution_11_5 {
    public int solution(int[] arr, int idx) {
        int l4 = arr.length;
        for(int i = idx; i < l4; i++){
            if(arr[i] == 1)
                return i;
        }
        return -1;
    }
}