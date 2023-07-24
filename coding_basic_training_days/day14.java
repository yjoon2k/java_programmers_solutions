import java.util.ArrayList;

public class day14 {

}

class Solution_14_1 {
    public int solution(int[] num_list) {
        int o = 0, e = 0, l = num_list.length;
        for(int i = 0; i < l; i++){
            if(i % 2 == 0)
                e += num_list[i];
            else
                o += num_list[i];
        }
        return o > e ? o : e;
    }
}

class Solution_14_2 {
    public String[] solution(String[] names) {
        int l = names.length, tmp = 0;
        String[] answer = new String[l % 5 == 0 ? (int)l / 5 : (int)(l / 5) + 1];
        for(int i = 0; i < l; i += 5)
            answer[tmp++] = names[i];
        return answer;
    }
}

class Solution_14_3 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arrayList = new ArrayList<>();
        int l1 = finished.length;
        for(int i = 0; i < l1; i++)
            if(!finished[i]) arrayList.add(todo_list[i]);
        String[] answer = arrayList.toArray(new String[arrayList.size()]);;
        return answer;
    }
}

class Solution_14_4 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i = 0; i < numbers.length; i++){
            answer += numbers[i];
            if(answer > n)
                return answer;
        }
        return answer;
    }
}

class Solution_14_5 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++)
            for(int j = queries[i][0]; j <= queries[i][1]; j++)
                arr[j] += 1;
        return arr;
    }
}