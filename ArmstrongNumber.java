import java.io.*;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int n = num.length();
        int sum = 0;
        for (char c : num.toCharArray()) {
            sum += Math.pow(c - '0', n); 
        }
        if (sum == Integer.parseInt(num)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
