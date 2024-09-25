


import java.util.*;
public class repeat_string {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) // same character found
                {
                    break;
                }
            }
            if (i == j) {
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
