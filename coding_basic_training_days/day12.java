import java.util.Arrays;

public class day12 {
    
}

class Solution_12_1 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2], l = num_list.length;
        if(n == 1){
            int[] answer = new int[b + 1];
            answer = Arrays.copyOfRange(num_list, 0, b + 1);
            return answer;
        }
        else if(n == 2){
            int[] answer = new int[l - a + 1];
            answer = Arrays.copyOfRange(num_list, a, l);
            return answer;
        }
        else if(n == 3){
            int[] answer = new int[b - a + 1];
            answer = Arrays.copyOfRange(num_list, a, b + 1);
            return answer;
        }
        else{
            int l1 = (int) (b - a) / c + 1;
            int[] answer = new int[l1];
            int tmp = 0;
            for(int i = a; i <= b; i += c)
                answer[tmp++] = num_list[i];
            return answer;
        }
    }
}

class Solution_12_2 {
    public int solution(int[] num_list) {
        int l2 = num_list.length;
        for(int i = 0; i < l2; i++)
            if(num_list[i] < 0)
                return i;
        return -1;
    }
}

class Solution_12_3 {
    public int[] solution(int[] arr, int[][] intervals) {
        int a = intervals[0][0], b = intervals[0][1];
        int c = intervals[1][0], d = intervals[1][1];
        int[] answer = new int[b - a + d - c + 2];
        int tmp = 0;
        for(int i = a; i <= b; i++)
            answer[tmp++] = arr[i];
        for(int i = c; i <= d; i++)
            answer[tmp++] = arr[i];
        return answer;
    }
}

class Solution_12_4 {
    public int[] solution(int[] arr) {
        int s = -1, l3 = arr.length;
        int e = l3;
        for(int i = 0; i < l3; i++){
            if(arr[i] == 2){
                s = i;
                break;
            }
        }
        for(int i = l3 - 1; i >= 0; i--){
            if(arr[i] == 2){
                e = i;
                break;
            }
        }
        if(s == -1){
            int[] answer = {-1};
            return answer;
        }
        else if(s == e){
            int[] answer = {2};
            return answer;
        }
        int[] answer = new int[e - s + 1];
        int tmp = 0;
        for(int i = s; i <= e; i++){
            answer[tmp++] = arr[i];
        }
        return answer;
    }
}

class Solution_12_5 {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        int l5 = query.length;
        for(int i = 0; i < l5; i++){
            if(i % 2 == 0){
                answer = Arrays.copyOfRange(answer, 0, query[i] + 1);
            }
            else{
                int l6 = answer.length;
                answer = Arrays.copyOfRange(answer, query[i], l6);
            }
        }
        return answer;
    }
}