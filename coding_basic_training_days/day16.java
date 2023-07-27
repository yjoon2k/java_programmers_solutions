public class day16 {
    
}

class Solution_16_1 {
    public String solution(String myString) {
        return myString.toUpperCase();
    }
}

class Solution_16_2 {
    public String solution(String myString) {
        return myString.toLowerCase();
    }
}

class Solution_16_3 {
    public String[] solution(String[] strArr) {
        int l = strArr.length;
        String[] answer = new String[l];
        for(int i = 0; i < l; i++){
            if(i % 2 == 0)
                answer[i] = strArr[i].toLowerCase();
            else
                answer[i] = strArr[i].toUpperCase();
        }
        return answer;
    }
}

class Solution_16_4 {
    public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase();
        int l = myString.length();
        for(int i = 0; i < l; i++){
            if(myString.charAt(i) == 'a')
                answer += 'A';
            else
                answer += myString.charAt(i);
        }
        return answer;
    }
}

class Solution_16_5 {
    public String solution(String my_string, String alp) {
        String answer = "";
        int l1 = my_string.length();
        char tmp = alp.charAt(0);
        for(int i = 0; i < l1; i++){
            if(my_string.charAt(i) == tmp)
                answer += alp.toUpperCase();
            else
                answer += my_string.charAt(i);
        }
        return answer;
    }
}