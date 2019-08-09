import java.util.*;
import java.io.*;
import java.math.*;

public class No851 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String n = sc.nextLine();
    	String aa = sc.nextLine();
    	
    	if(aa.contains(" ")) {
    		System.out.println("\"assert\"");
    		return;
    	}
    	long a1 = Long.parseLong(aa), a2 = sc.nextLong(), a3 = sc.nextLong();
    	long[] a = {a1 + a2, a1 + a3, a2 + a3};
    	Arrays.sort(a);
    	if(a[1] == a[2]) System.out.println(a[0]);
    	else System.out.println(a[1]);
    }
}
