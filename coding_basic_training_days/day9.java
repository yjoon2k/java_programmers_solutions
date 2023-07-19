import java.util.ArrayList;
import java.util.Collections;

public class day9 {
    
}

class Solution_9_1 {
    int trans(String str){
        int l = str.length();
        int tmp = 1, rt = 0;
        for(int i = l - 1; i >= 0; i--){
            rt += tmp * (int)(str.charAt(i) - '0');
            tmp *= 10;
        }
        return rt;
    }
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        int l1 = intStrs.length;
        for(int j = 0; j < l1; j++){
            String tmp = "";
            for(int i = s; i < s + l; i++)
                tmp += intStrs[j].charAt(i);
            int ab = trans(tmp);
            if(ab > k)
                list.add(ab);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();;
        return answer;
    }
}

class Solution_9_2 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int l2 = my_strings.length;
        for(int i = 0; i < l2; i++)
            for(int j = parts[i][0]; j <= parts[i][1]; j++)
                answer += my_strings[i].charAt(j);
        return answer;
    }
}

class Solution_9_3 {
    public String solution(String my_string, int n) {
        String answer = "";
        int l3 = my_string.length();
        for(int i = l3 - n; i < l3; i++)
            answer += my_string.charAt(i);
        return answer;
    }
}

class Solution_9_4 {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        int l4 = my_string.length();
        for(int i = 0; i < l4; i++){
            String tmp = "";
            for(int j = i; j < l4; j++)
                tmp += my_string.charAt(j);
            list.add(tmp);
        }
        Collections.sort(list);
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}

class Solution_9_5 {
    public int solution(String my_string, String is_suffix) {
        int answer = 1;
        int l5 = my_string.length(), l6 = is_suffix.length();
        if(l5 < l6)
            return 0;
        for(int i = 1; i <= l6; i++){
            if(my_string.charAt(l5 - i) != is_suffix.charAt(l6 - i))
                answer = 0;
        }
        return answer;
    }
}