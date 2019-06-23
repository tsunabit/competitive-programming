import java.util.*;
import java.io.*;
import java.math.*;

public class No667 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	int ata = s.replace("x", "").length();
    	String[] str = s.split("");
    	
    	for(int i = 0; i < s.length(); i++) {
    		System.out.println(String.format("%.7f", ((double)ata / (s.length() - i)) * 100));
    		if("o".equals(str[i])) ata--;
    	}
    }
}
