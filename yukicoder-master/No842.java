import java.util.*;
import java.io.*;
import java.math.*;

public class No842 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] a = sc.nextLine().split(" ");
    	int[] k = new int[a.length];
    	for(int i = 0; i < a.length; i++) {
    		k[i] = Integer.parseInt(a[i]);
    	}
    	int[] coin = {500,100,50,10,5,1};
    	
    	boolean f = false;
    	for(int i = 0; i < 6; i++) {
    		while(k[6] >= coin[i] && k[i] != 0 && k[6] != 0) {
    			k[6] -= coin[i];
    			k[i] -= 1;
    		}
    		if(k[6] == 0) {
    			f = true;
    			break;
    		}
    	}
    	
    	if(f) System.out.println("YES");
    	else System.out.println("NO");
    }
}
