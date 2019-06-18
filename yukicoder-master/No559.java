import java.util.*;
import java.io.*;
import java.math.*;

public class No559 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	int b = 0, out = 0;
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == 'A') {
    			out += b;
    		}else {
    			b++;
    		}
    	}
    	System.out.println(out);
    }
}
