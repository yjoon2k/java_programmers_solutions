import java.util.ArrayList;
import java.util.Collections;

public class day18 {
    
}

class Solution_18_1 {
    public int[] solution(String myString) {
        int l = myString.length(), l1 = 0;
        for(int i = 0; i < l; i++)
            if(myString.charAt(i) == 'x')
                l1++;
        int[] answer = new int[l1 + 1];
        int j = 0, tmp = 0;
        for(int i = 0; i < l; i++){
            if(myString.charAt(i) == 'x'){
                answer[j++] = tmp;
                tmp = 0;
            }
            else
                tmp++;
        }
        answer[j] = tmp;
        return answer;
    }
}

class Solution_18_2 {
    public String[] solution(String myString) {
        ArrayList<String> ans = new ArrayList<String>();
        int l2 = myString.length();
        String tmp = "";
        for(int i = 0; i < l2; i++){
            if(myString.charAt(i) != 'x')
                tmp += myString.charAt(i);
            else if(tmp.length() != 0){
                ans.add(tmp);
                tmp = "";
            }
        }
        if(tmp.length() != 0)
            ans.add(tmp);
        Collections.sort(ans);
        String[] answer = ans.toArray(new String[ans.size()]);
        return answer;
    }
}

class Solution_18_3 {
    public int solution(String binomial) {
        int flag = 0, ind = 0;
        int l3 = binomial.length();
        int a = 0, b = 0;
        for(int i = 0; i < l3; i++){
            char tmp = binomial.charAt(i);
            if(tmp == '+'){
                flag = 1;
                ind = i;
                break;
            }
            else if(tmp == '-'){
                flag = 2;
                ind = i;
                break;
            }
            else if(tmp == '*'){
                flag = 3;
                ind = i;
                break;
            }
        }
        for(int i = 0; i < ind - 1; i++){
            a *= 10;
            a += (int)binomial.charAt(i) - '0';
        }
        for(int i = ind + 2; i < l3; i++){
            b *= 10;
            b += (int)binomial.charAt(i) - '0';
        }
        if(flag == 1)
            return a + b;
        else if(flag == 2)
            return a - b;
        else
            return a * b;
    }
}

class Solution_18_4 {
    public int solution(String myString, String pat) {
        String my_string = "";
        int l4 = myString.length();
        for(int i = 0; i < l4; i++){
            if(myString.charAt(i) == 'A')
                my_string += 'B';
            else
                my_string += 'A';
        }
        return my_string.contains(pat) ? 1 : 0;
    }
}

class Solution_18_5 {
    public String solution(String rny_string) {
        String answer = "";
        for(int i = 0; i < rny_string.length(); i++){
            if(rny_string.charAt(i) == 'm')
                answer += "rn";
            else
                answer += rny_string.charAt(i);
        }
        return answer;
    }
}