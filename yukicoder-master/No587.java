import java.util.*;
import java.io.*;
import java.math.*;

public class No587 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] s = sc.next().split("");
    	HashMap<String, Integer> m = new HashMap<String, Integer>();
    	for(String v : s) {
    		if(m.containsKey(v)) m.put(v, m.get(v) + 1);
    		else m.put(v, 1);
    	}
    	String o = "";
    	for(String k : m.keySet()) {
    		if(m.get(k) >= 3 || (m.get(k) == 1 && o != "")) {
    			System.out.println("Impossible");
    			return;
    		}else if(m.get(k) == 1) {
    			o = k;
    		}
    	}
    	System.out.println(o);
    }
}
