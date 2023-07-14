import java.util.Scanner;

public class day2 {
    
}

class Solution_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

class Solution_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.println(a + b);
    }
}

class Solution_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int l = a.length();
        for(int i = 0; i < l; i++){
            System.out.println(a.charAt(i));
        }
    }
}

class Solution_2_4 {
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