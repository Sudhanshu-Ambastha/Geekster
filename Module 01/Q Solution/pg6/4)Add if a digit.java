import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);

        if (ch >= '0' && ch <= '9') {
            int num = (ch - '0');
            System.out.println(num + 100);
        } else {
            System.out.println("This is not a digit");
        }
    }
}