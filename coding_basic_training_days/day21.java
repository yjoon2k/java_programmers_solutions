import java.util.*;

public class day21 {
    
}

class Solution_21_1 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}

class Solution_21_2 {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i < rank.length; i++)
            if(attendance[i])
                hash.put(i, rank[i]);
        ArrayList<Integer> valueList = new ArrayList<>(hash.values());
        Collections.sort(valueList);
        int a = getKey(hash, valueList.get(0)), b = getKey(hash, valueList.get(1)), c = getKey(hash, valueList.get(2));
        return 10000 * a + 100 * b + c;
    }
    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}

class Solution_21_3 {
    public int solution(double flo) {
        return (int) flo;
    }
}

class Solution_21_4 {
    public int solution(String num_str) {
        int answer = 0;
        for(int i = 0; i < num_str.length(); i++)
            answer += (int) (num_str.charAt(i) - '0');
        return answer;
    }
}

class Solution_21_5 {
    public int solution(String n_str) {
        int answer = 0;
        for(int i = 0; i < n_str.length(); i++){
            answer *= 10;
            answer += (int) (n_str.charAt(i) - '0');
        }
        return answer;
    }
}