import java.io.*;
import java.util.*;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) { 
                count++;
            }
        }
        System.out.println(count);
    }
}
