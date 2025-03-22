import java.io.*;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("True"); 
        } else {
            System.out.println("False");
        }
    }
}
