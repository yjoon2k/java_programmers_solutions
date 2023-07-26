import java.util.Arrays;

public class day15 {
    
}

class Solution_15_1 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0)
                answer[i] = (int) arr[i] / 2;
            else if(arr[i] < 50 && arr[i] % 2 == 1)
                answer[i] = arr[i] * 2;
            else
                answer[i] = arr[i];
        }
        return answer;
    }
}

class Solution_15_2 {
    public int solution(int[] arr) {
        int answer = 0, l = arr.length;
        while(true){
            int[] tmp = new int[l];
            for(int i = 0; i < l; i++)
                tmp[i] = arr[i];
            for(int i = 0; i < l; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0)
                arr[i] = (int) arr[i] / 2;
            else if(arr[i] < 50 && arr[i] % 2 == 1)
                arr[i] = arr[i] * 2 + 1;
            }
            if(Arrays.equals(tmp, arr))
                return answer;
            answer++;   
        }
    }
}

class Solution_15_3 {
    public int solution(int[] num_list) {
        int answer = 0, l1 = num_list.length;
        for(int j = 0; j < l1; j++){
            int k = num_list[j];
            while(k != 1){
                if(k % 2 == 0)
                    k = (int) k / 2;
                else
                    k = (int) (k - 1) / 2;
                answer++;
            }
        }
        return answer;
    }
}

class Solution_15_4 {
    public int solution(int[] num_list) {
        int answer = 0, l2 = num_list.length;
        if(l2 > 10){
            for(int i = 0; i < l2; i++)
                answer += num_list[i];
        }
        else{
            answer = 1;
            for(int i = 0; i < l2; i++)
                answer *= num_list[i];
        }
        return answer;
    }
}

class Solution_15_5 {
    public int solution(String myString, String pat) {
        int tmp = 0, ls = myString.length(), lp = pat.length();
        int[] cmyString = new int[ls];
        int[] cpat = new int[lp];
        for(int i = 0; i < ls; i++){
            if(myString.charAt(i) <= 'Z')
                cmyString[i] = ((int)myString.charAt(i) + 32);
            else
                cmyString[i] = (int) myString.charAt(i);
        }
        for(int i = 0; i < lp; i++){
            if(pat.charAt(i) <= 'Z')
                cpat[i] = ((int)pat.charAt(i) + 32);
            else
                cpat[i] = (int) pat.charAt(i);
        }
        
        if(ls < lp)
            return 0;
        for(int i = 0; i < ls; i++){
            if(tmp == lp - 1)
                return 1;
            else if(cpat[tmp] == cmyString[i])
                tmp++;
            else if(cpat[tmp] != cmyString[i])
                tmp = 0;
        }
        return 0;
    }
}