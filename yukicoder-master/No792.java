import java.util.*;
import java.io.*;
import java.math.*;

public class No792 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	String o = "A=";
    	int[][] q = new int[(int)Math.pow(2, n)][n+1];
    	boolean f0 = false, f1 = false;
    	// ∧∨¬⊥⊤
    	for(int i = 0; i < Math.pow(2, n); i++) {
    		for(int j = 0; j < n + 1; j++) {
    			q[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(int i = 0; i < Math.pow(2, n); i++) {
    			if(q[i][n] == 0) f0 = true;
    			else f1 = true;
    	}
    	if(f0 && !f1) {
    		System.out.println("A=⊥");
    		return;
    	}else if(!f0 && f1) {
    		System.out.println("A=⊤");
    		return;
    	}
    	
    	for(int i = 0; i < Math.pow(2, n); i++) {
    		if(q[i][n] == 1) {
    			o += "(";
    			for(int j = 0; j < n; j++) {
    				if(q[i][j] == 1) o += "P_" + (j+1) + "∧";
    				else o += "¬P_" + (j+1) + "∧";
        		}
    			o += ")";
    		}
    	}
    	o = o.replaceAll("∧\\)\\(", "\\)∨\\(");
    	o = o.replaceAll("∧\\)", "\\)");
    	System.out.println(o);
    }
}
