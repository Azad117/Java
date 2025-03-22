import java.io.*;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<String> unique = new ArrayList<>();
        for (String s : input) {
            if (!unique.contains(s)) {
                unique.add(s);
            }
        }
        System.out.println(unique);
    }
}
