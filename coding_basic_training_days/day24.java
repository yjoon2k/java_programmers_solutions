public class day24 {
    
}

class Solution_24_1 {
    public int solution(String[] order) {
        int am = 0, la = 0;
        for(int i = 0; i < order.length; i++){
            if(order[i].contains("americano"))
                am++;
            else if(order[i].contains("cafelatte"))
                la++;
            else
                am++;
        }
        return am * 4500 + la * 5000;
    }
}

class Solution_24_2 {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i = 0; i < answer.length; i++)
            answer[i] = "";
        int tmp = 0;
        for(int j = 0; j < picture.length; j++){
            String temp = "";
            for(int i = 0; i < picture[j].length(); i++)
                for(int q = 0; q < k; q++)
                    temp += picture[j].charAt(i);
            for(int q = 0; q < k; q++)
                answer[tmp++] = temp;
        }
        return answer;
    }
}

class Solution_24_3 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        if(k % 2 == 1)
            for(int i = 0; i < arr.length; i++)
                answer[i] = arr[i] * k;
        else
            for(int i = 0; i < arr.length; i++)
                answer[i] = arr[i] + k;
        return answer;
    }
}

class Solution_24_4 {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0 ; i < myString.length(); i++){
            if(myString.charAt(i) < 'l')
                answer += 'l';
            else
                answer += myString.charAt(i);
        }
        return answer;
    }
}

class Solution_24_5 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j)
                    answer[i][j] = 1;
                else
                    answer[i][j] = 0;
            }
        }
        return answer;
    }
}