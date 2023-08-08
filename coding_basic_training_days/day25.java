public class day25 {
    
}

class Solution_25_1 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int tmp = 1, flag = 1, i = 0, j = 0;
        while(true){
            if(tmp > n * n)
                break;
            answer[i][j] = tmp++;
            if(flag == 1){
                if(j + 1 == n || answer[i][j+1] != 0){
                    flag = 2;
                    i++;
                }
                else
                    j++;
            }
            else if(flag == 2){
                if(i + 1 == n || answer[i+1][j] != 0){
                    flag = 3;
                    j--;
                }
                else
                    i++;
            }
            else if(flag == 3){
                if(j == 0 || answer[i][j-1] != 0){
                    flag = 4;
                    i--;
                }
                else
                    j--;
            }
            else{
                if(i == 0 || answer[i-1][j] != 0){
                    flag = 1;
                    j++;
                }
                else
                    i--;
            }
        }
        return answer;
    }
}

class Solution_25_2 {
    public int solution(int[][] arr) {
        int answer = 1;
        int l = arr.length;
        for(int i = 0; i < l; i++)
            for(int j = 0; j < l; j++)
                if(arr[i][j] != arr[j][i])
                    return 0;
        return answer;
    }
}

class Solution_25_3 {
    public int[][] solution(int[][] arr) {
        int l1 = arr.length, l2 = arr[0].length;
        if(l1 > l2){
            int[][] answer = new int[l1][l1];
            for(int j = 0; j < l1; j++){
                for(int i = 0; i < l2; i++)
                    answer[j][i] = arr[j][i];
                for(int i = l2; i < l1; i++)
                    answer[j][i] = 0;
            }
            return answer;
        }
        else if(l1 < l2){
            int[][] answer = new int[l2][l2];
            for(int i = 0; i < l1; i++)
                for(int j = 0; j < l2; j++)
                    answer[i][j] = arr[i][j];
            for(int i = l1; i < l2; i++)
                for(int j = 0; j < l2; j++)
                    answer[i][j] = 0;
            return answer;
        }
        else{
            return arr;
        }
    }
}

class Solution_25_4 {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[i].length; j++)
                if(i + j <= k)
                    answer += board[i][j];
        return answer;
    }
}