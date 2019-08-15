import java.util.*;
import java.io.*;
import java.math.*;

public class No8 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int p = sc.nextInt();
    	for(int i = 0; i < p; i++) {
    		int n = sc.nextInt(), k = sc.nextInt();
    		if((n-1) % (k+1) != 0) System.out.println("Win");
    		else System.out.println("Lose");
    	}
	}
}
