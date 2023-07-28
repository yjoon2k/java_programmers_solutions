public class day17 {
    
}

class Solution_17_1 {
    public String solution(String myString, String pat) {
        int tmp = 0;
        while(true){
            if(myString.indexOf(pat, tmp) == -1)
                break;
            tmp = myString.indexOf(pat, tmp) + 1;
        }
        return myString.substring(0, tmp + pat.length() - 1);
    }
}

class Solution_17_2 {
    public int solution(String myString, String pat) {
        int answer = 0, tmp = 0;
        while(true){
            if(myString.indexOf(pat, tmp) == -1)
                break;
            tmp = myString.indexOf(pat, tmp) + 1;
            answer += 1;
        }
        return answer;
    }
}

class Solution_17_3 {
    public String[] solution(String[] strArr) {
        int l = strArr.length, tmp = 0, k = 0;
        for(int i = 0; i < l; i++){
            if(strArr[i].contains("ad"))
                continue;
            else
                k++;
        }
        String[] answer = new String[k];
        for(int i = 0; i < l; i++){
            if(strArr[i].contains("ad"))
                continue;
            else
                answer[tmp++] = strArr[i];
        }
        return answer;
    }
}

class Solution_17_4 {
    public String[] solution(String my_string) {
        int l1 = my_string.length(), l2 = l1 - my_string.replace(" ", "").length();
        String[] answer = new String[l2 + 1];
        String tmp = "";
        int k = 0;
        for(int i = 0; i < l1; i++){
            if(my_string.charAt(i) == ' '){
                answer[k++] = tmp;
                tmp = "";
            }
            else{
                tmp += my_string.charAt(i);
            }
        }
        answer[k] = tmp;
        return answer;
    }
}

class Solution_17_5 {
    public String[] solution(String my_string) {
        int l3 = my_string.length(), tmp = 0, le = 0;
        String temp = "";
        for(int i = 0; i < l3; i++){
            if(tmp != 0 && my_string.charAt(i) == ' '){
                le++;
                tmp = 0;
            }
            if(my_string.charAt(i) != ' ')
                tmp++;
        }
        if(tmp != 0)
            le++;
        tmp = 0;
        String[] answer = new String[le];
        
        for(int i = 0; i < l3; i++){
            if(temp.length() != 0 && my_string.charAt(i) == ' '){
                answer[tmp++] = temp;
                temp = "";
            }
            else if(my_string.charAt(i) != ' '){
                temp += my_string.charAt(i);
            }
        }
        if(temp.length() != 0)
            answer[tmp] = temp;
        
        return answer;
    }
}