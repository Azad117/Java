import java.io.*;
import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() == str2.length()) {
            System.out.println("True"); 
        } else {
            System.out.println("False");
        }
    }
}
