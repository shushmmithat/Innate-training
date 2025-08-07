import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int square = n * n;
        int temp = n;
        boolean isAutomorphic = true;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAutomorphic)
            System.out.println("Automorphic");
        else
            System.out.println("Not Automorphic");

           }
}