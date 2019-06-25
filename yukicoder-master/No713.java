import java.util.*;
import java.io.*;
import java.math.*;

public class No713 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int o = 0;
    	for(int i = 1; i <= n; i++) {
    		int yaku = 0;
    		for(int j = 1; j <= i; j++) {
    			if(i % j == 0) {
    				yaku++;
    			}
    		}
    		if(yaku == 2) {
    			o += i;
    		}
    	}
    	System.out.println(o);
    }
}
