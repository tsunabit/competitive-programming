import java.util.*;
import java.io.*;
import java.math.*;

public class No717 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	String s = sc.next();
    	String t = sc.next();
    	int c = 0;
    	c += s.replaceAll("B", "").length() < t.replaceAll("B", "").length()? s.replaceAll("B", "").length() : t.replaceAll("B", "").length();
    	c += s.replaceAll("A", "").length() < t.replaceAll("A", "").length()? s.replaceAll("A", "").length() : t.replaceAll("A", "").length();
    	System.out.println(c);
    }
}
