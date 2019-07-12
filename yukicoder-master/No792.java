import java.util.*;
import java.io.*;
import java.math.*;

public class No792 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	StringBuilder sb = new StringBuilder();
    	sb.append("A=");
    	int[][] q = new int[(int)Math.pow(2, n)][n+1];
    	int c = 0;
    	// ∧∨¬⊥⊤
    	for(int i = 0; i < Math.pow(2, n); i++) {
    		for(int j = 0; j < n + 1; j++) {
    			q[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(int i = 0; i < Math.pow(2, n); i++) {
    		if(q[i][n] == 1) {
    			c++;
    			sb.append("(");
    			for(int j = 0; j < n; j++) {
    				if(q[i][j] == 1)  sb.append("P_" + (j+1) + "∧");
    				else sb.append("¬P_" + (j+1) + "∧");
        		}
    			sb.append(")");
    			
    		}
    	}
    	if(c == 0) {
    		System.out.println("A=⊥");
    	}else if(c == (int)Math.pow(2, n)) {
    		System.out.println("A=⊤");
    	}else {
    		String str = "";
    		str = sb.toString().replaceAll("∧\\)\\(", "\\)∨\\(");
        	str = str.toString().replaceAll("∧\\)", "\\)");
        	System.out.println(str);
    	}
    }
}
