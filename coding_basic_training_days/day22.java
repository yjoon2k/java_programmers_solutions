import java.math.BigInteger;
import java.util.*;

public class day22 {
    
}

class Solution_22_1 {
    public String solution(String n_str) {
        String answer = "";
        int l = n_str.length(), i = 0;
        for(i = 0; i < l; i++){
            if(n_str.charAt(i) != '0')
                break;
        }
        for(int j = i; j < l; j++)
            answer += n_str.charAt(j);
        return answer;
    }
}

class Solution_22_2 {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        
        BigInteger sum = numA.add(numB);
        
        return sum.toString();
    }
}

class Solution_22_3 {
    public String solution(int n) {
        String str = "";
        while(n != 0){
            str += (char) n % 10;
            n = (int) n / 10;
        }
        StringBuffer sb = new StringBuffer(str);
        String answer = sb.reverse().toString();
        return answer;
    }
}

class Solution_22_4 {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(!isInArray(arr[i], delete_list))
                ans.add(arr[i]);
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
    
    public boolean isInArray(int n, int[] li){
        int l = li.length;
        for(int i = 0; i < l; i++)
            if(n == li[i])
                return true;
        return false;
    }
}

class Solution_22_5 {
    public int solution(String my_string, String target) {
        if(my_string.contains(target))
            return 1;
        else
            return 0;
    }
}