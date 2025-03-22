import java.io.*;
import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int decimal = 0;
        int len = binary.length();
        for (int i = 0; i < len; i++) {
            int bit = binary.charAt(i) - '0'; 
            decimal += bit * (1 << (len - i - 1)); 

        }
        System.out.println(decimal);
    }
}
