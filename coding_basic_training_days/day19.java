import java.util.ArrayList;

public class day19 {
    
}

class Solution_19_1 {
    public String[] solution(String myStr) {
        ArrayList<String> ans = new ArrayList<String>();
        String tmp = "";
        int l = myStr.length();
        for(int i = 0; i < l; i++){
            char t = myStr.charAt(i);
            if(t == 'a' || t == 'b' || t == 'c'){
                if(tmp.length() != 0){
                    ans.add(tmp);
                    tmp = "";
                }
            }
            else
                tmp += t;
        }
        if(tmp.length() != 0)
            ans.add(tmp);
        if(ans.size() == 0)
            ans.add("EMPTY");
        String[] answer = ans.toArray(new String[ans.size()]);
        return answer;
    }
}

class Solution_19_2 {
    public int[] solution(int[] arr) {
        int l1 = arr.length, l2 = 0, tmp = 0;
        for(int i = 0; i < l1; i++)
            l2 += arr[i];
        int[] answer = new int[l2];
        for(int i = 0; i < l1; i++){
            for(int j = 0; j < arr[i]; j++)
                answer[tmp++] = arr[i];
        }
        return answer;
    }
}

class Solution_19_3 {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int l3 = flag.length;
        for(int i = 0; i < l3; i++){
            if(flag[i]){
                for(int j = 0; j < 2 * arr[i]; j++)
                    ans.add(arr[i]);
            }
            else{
                for(int j = 0; j < arr[i]; j++)
                    ans.remove(ans.size() - 1);
            }
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
}

class Solution_19_4 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<Integer>();
        int l4 = arr.length;
        for(int i = 0; i < l4; i++){
            if(stk.size() == 0)
                stk.add(arr[i]);
            else if(arr[i] == stk.get(stk.size() - 1))
                stk.remove(stk.size() - 1);
            else
                stk.add(arr[i]);
        }
        if(stk.size() == 0)
            stk.add(-1);
        int[] answer = new int[stk.size()];
        for(int i = 0; i < stk.size(); i++)
            answer[i] = stk.get(i);
        return answer;
    }
}

class Solution_19_5 {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(li.size() == k)
                break;
            if(!li.contains(arr[i]))
                li.add(arr[i]);
        }
        while(li.size() < k)
            li.add(-1);
        int[] answer = new int[k];
        for(int i = 0; i < k; i++)
            answer[i] = li.get(i);
        return answer;
    }
}