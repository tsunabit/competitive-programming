import java.util.*;
import java.io.*;
import java.math.*;

public class No167 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = new BigInteger(sc.next());
		BigInteger m = new BigInteger(sc.next());
		System.out.println(n.modPow(m, BigInteger.TEN));
	}
}