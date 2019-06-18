import java.util.*;
import java.io.*;
import java.math.*;

public class No548 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    	
    	for(int i = 0; i < s.length(); i++) {
    		if(hm.containsKey(s.charAt(i))) {
    			hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
    		}else {
    			hm.put(s.charAt(i), 1);
    		}
    	}
    	int max = 0, min = 13, c = 0;
    	for (char k : hm.keySet()) {
    		if(2 < hm.get(k)) {
    			System.out.println("Impossible");
    			return;
    		}else if(hm.get(k) == 2) {
    			c++;
    		}
    	}
    	if(c > 1) {
    		System.out.println("Impossible");
    	}else {
    		char[] moji = {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
    		if(c == 1) {
    			for(int i = 0; i < 13; i++) {
    				if(!hm.containsKey(moji[i])) {
    					System.out.println(moji[i]);
    				}
    			}
    		}else {
    			for(int i = 0; i < 13; i++) {
    				System.out.println(moji[i]);
    			}
    		}
    	}
    }
}
