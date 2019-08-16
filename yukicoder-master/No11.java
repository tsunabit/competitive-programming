import java.util.*;
import java.io.*;
import java.math.*;

public class No11 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt();
    	HashSet<Integer> ma = new HashSet<Integer>();
    	HashSet<Integer> su = new HashSet<Integer>();
    	for(int i = 0; i < n; i++) {
    		ma.add(sc.nextInt());
    		su.add(sc.nextInt());
    	}
    	// マッチするマーク + マッチする数字 - 重複カウント - 手札
    	System.out.println(ma.size()*h+su.size()*w-ma.size()*su.size()-n);
	}
}
