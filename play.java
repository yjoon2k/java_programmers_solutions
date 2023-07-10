import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        
    }
}

public class Solution_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

public class Solution_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.println(a + b);
    }
}

public class Solution_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int l = a.length();
        for(int i = 0; i < l; i++){
            System.out.println(a.charAt(i));
        }
    }
}

public class Solution_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }
}

class Solution_2_5 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int l1 = my_string.length();
        int l2 = overwrite_string.length();
        for(int i = 0; i < s; i++){
            answer += my_string.charAt(i);
        }
        answer += overwrite_string;
        for(int i = l2 + s; i < l1; i++){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}

class Solution_3_1 {
    public String solution(String str1, String str2) {
        String answer = "";
        int l = str1.length();
        for(int i = 0; i < l; i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}

class Solution_3_2 {
    public String solution(String[] arr) {
        String answer = "";
        int l = arr.length;
        for(int i = 0; i < l; i++){
            answer += arr[i];
        }
        return answer;
    }
}

class Solution_3_3 {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < k; i++){
            answer += my_string;
        }
        return answer;
    }
}

class Solution_3_4 {
    public int solution(int a, int b) {
        int A = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int B = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return A > B ? A : B;
    }
}

class Solution_3_5 {
    public int solution(int a, int b) {
        int A = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int B = 2 * a * b;
        return A > B ? A : B;
    }
}