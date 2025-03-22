import java.io.*;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String num = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
