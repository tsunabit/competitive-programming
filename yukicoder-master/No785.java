import java.util.*;
import java.io.*;
import java.math.*;

public class No785 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int r = "NONE".equals(sc.next())? 16 : 16 - sc.next().replaceAll(",", "").length();
    	int g = "NONE".equals(sc.next())? 16 : 16 - sc.next().replaceAll(",", "").length();
    	int b = "NONE".equals(sc.next())? 16 : 16 - sc.next().replaceAll(",", "").length();
    	System.out.println(r * r * g * g * b * b);
    }
}
