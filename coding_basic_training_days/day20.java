import java.util.*;

public class day20 {
    
}

class Solution_20_1 {
    public int[] solution(int[] arr) {
        int l = arr.length, i = 0;
        for(i = 1; i < l; i *= 2);
        int[] answer = new int[i];
        for(int j = 0; j < l; j++)
            answer[j] = arr[j];
        for(int j = l; j < i; j++)
            answer[j] = 0;
        return answer;
    }
}

class Solution_20_2 {
    public int solution(int[] arr1, int[] arr2) {
        int l1 = arr1.length, l2 = arr2.length;
        if(l1 > l2)
            return 1;
        else if(l1 < l2)
            return -1;
        int a = 0, b = 0;
        for(int i = 0; i < l1; i++){
            a += arr1[i];
            b += arr2[i];
        }
        if(a > b)
            return 1;
        else if(a < b)
            return -1;
        else
            return 0;
    }
}

class Solution_20_3 {
    public int solution(String[] strArr) {
        int[] answer = new int[31];
        for(int i = 0; i < 31; i++)
            answer[i] = 0;
        for(int i = 0; i < strArr.length; i++)
            answer[strArr[i].length()]++;
        int max = 0;
        for(int i = 0; i < 31; i++)
            if(answer[i] > max)
                max = answer[i];
        return max;
    }
}

class Solution_20_4 {
    public int[] solution(int[] arr, int n) {
        if(arr.length % 2 == 0){
            for(int i = 0; i < arr.length; i++)
                if(i % 2 == 1)
                    arr[i] += n;
        }
        else{
            for(int i = 0; i < arr.length; i++)
                if(i % 2 == 0)
                    arr[i] += n;
        }
        return arr;
    }
}

class Solution_20_5 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);
        for(int i = 0; i < 5; i++)
            answer[i] = num_list[i];
        return answer;
    }
}