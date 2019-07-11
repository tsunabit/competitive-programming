import java.util.*;
import java.io.*;
import java.math.*;

public class No785 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String R = sc.next(), G = sc.next(), B = sc.next();
    	int r = "NONE".equals(R)? 16 : 16 - R.replaceAll(",", "").length();
    	int g = "NONE".equals(G)? 16 : 16 - G.replaceAll(",", "").length();
    	int b = "NONE".equals(B)? 16 : 16 - B.replaceAll(",", "").length();
    	System.out.println(r * r * g * g * b * b);
    }
}
