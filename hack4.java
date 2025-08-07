import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int f=sc.nextInt();
        int p=sc.nextInt();
        float h=sc.nextFloat();
        System.out.printf("My name is %s, my Instagram has %d followers, I have posted %d posts, and I use Instagram for %.1f hours daily.",s,f,p,h);
        
    }
}