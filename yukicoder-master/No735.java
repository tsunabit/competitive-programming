import java.util.*;
import java.io.*;
import java.math.*;

public class No735 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double r = sc.nextDouble(), d = sc.nextDouble();
    	System.out.println(String.format("%.6f", Math.sqrt(Math.pow(d, 2) - Math.pow(r, 2))));
    }
}
