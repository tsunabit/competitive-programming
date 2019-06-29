import java.util.*;
import java.io.*;
import java.math.*;

public class No730 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        ArrayList<String> al = new ArrayList<String>();
        for(String v : s) {
            if(al.contains(v)) {
                System.out.println("NO");
                return;
            } else {
                al.add(v);
            }
        }
        System.out.println("YES");
    }
}
