import java.io.*;
import java.util.*;

public class Largestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int max = 0;
        for (String s : input) {
            if (Integer.parseInt(s) > max) {
                max = Integer.parseInt(s);
            }
        }
        System.out.println(max);
    }
}
