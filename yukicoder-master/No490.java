import java.util.*;
import java.io.*;
import java.math.*;

public class No490 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt(),a[]=new int[2000],t,i,j;
		for(i=0;i<n;i++) a[i]=sc.nextInt();
		sc.close();
		for(i=1;i<2*n-3;i++) {
			for(j=0;j<n;j++) {
				if(i-j>n-1||0>i-j) continue;
				if(a[i-j]>a[j]) {
					t=a[j];
					a[j]=a[i-j];
					a[i-j]=t;
				}
			}
		}
		for(i=0;i<n-1;i++) System.out.print(a[i]+" ");
		System.out.print(a[n-1]);
    }
}
