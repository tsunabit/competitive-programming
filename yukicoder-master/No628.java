import java.util.*;
import java.io.*;
import java.math.*;

public class No628 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	
    	for(int i = 0; i < n; i++) {
    		int no = sc.nextInt();
    		int m = sc.nextInt(), s = sc.nextInt();
    		for(int j = 0; j < m; j++) {
    			String t = sc.next();
    			if(map.containsKey(t)) map.put(t, map.get(t) + s);
    			else map.put(t, s);    					
    		}
    	}
    	ArrayList<Integer> al = new ArrayList<Integer>();
    	for(String k : map.keySet()) {
    		al.add(map.get(k));
    	}
    	Collections.sort(al);
    	for(int v : al) {
    		
    	}
    	
    	System.out.println("---");
    	for(String k : map.keySet()) {
    		System.out.println(k + " " + map.get(k));
    	}
    }
}
