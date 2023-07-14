import java.util.ArrayList;

public class day7 {
    
}

class Solution_7_1 {
    public int[] solution(int[] arr, int[][] queries) {
        int l2 = queries.length;
        for(int i = 0; i < l2; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(j % queries[i][2] == 0){
                    arr[j] += 1;
                }
            }
        }
        return arr;
    }
}

class Solution_7_2 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            if(i %5 != 0)
                continue;
            String str = i + "";
            boolean flag = true;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) != '5' && str.charAt(j) != '0') {
                    flag = false;
                }
            }
            if(flag) {
                list.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        int[] empty = {-1};
        if(answer.length == 0) return empty;
        return answer;
    }
}

class Solution_7_3 {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        for(int i = start; i <= end; i++)
            answer[i - start] = i;
        return answer;
    }
}

class Solution_7_4 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n != 1){
            list.add(n);
            if(n % 2 == 0){
                n = (int) n / 2;
            }
            else{
                n = 3 * n + 1;
            }
        }
        list.add(1);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}

class Solution_7_5 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<Integer>();
        int l = arr.length;
        int i = 0;
        while(i < l){
            if(stk.size() == 0)
                stk.add(arr[i++]);
            else if(stk.get(stk.size() - 1) < arr[i])
                stk.add(arr[i++]);
            else
                stk.remove(stk.size() - 1);
                
        }
        int[] answer = stk.stream().mapToInt(k->k).toArray();
        return answer;
    }
}