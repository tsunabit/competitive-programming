import java.util.*;
import java.io.*;
import java.math.*;

public class No836 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long l = sc.nextLong(), r = sc.nextLong();
    	int n = sc.nextInt();
    	int ans[] = new int[n];
    	
    	// 0までカウント
    	while(l % n != 0 && l <= r){
            ans[(int)(l%n)]++;
            l++;
        }
    	long bias = (r-l)/n;
    	
    	l += bias * n;
    	// 最後の0からカウント
    	while(l <= r){
            ans[(int)(l%n)]++;
            l++;
        }
    	for(int i = 0; i < n; i++)  System.out.println(ans[i] + bias);
    }
}
