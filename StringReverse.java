import java.io.*;
import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
