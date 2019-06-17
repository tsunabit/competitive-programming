import java.util.*;
import java.io.*;
import java.math.*;

public class No542 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt(), b = sc.nextInt();
    	
    	HashSet<Integer> hs = new HashSet<Integer>();
    	for(int i = 0; i <= a; i++) {
    		for(int j = 0; j <= b; j++) {
    			hs.add(i + (j * 5));
    		}
    	}
    	ArrayList<Integer> k = new ArrayList<Integer>();
    	for(int h : hs) {
    		k.add(h);
    	}
    	Collections.sort(k);
    	k.remove(0);
    	
    	for(int f : k) {
    		System.out.println(f);
    	}
    }
}
