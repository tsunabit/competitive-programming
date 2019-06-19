import java.util.*;
import java.io.*;
import java.math.*;

public class No571 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Map<Integer, String> m = new TreeMap<Integer, String>(Collections.reverseOrder());
    	m.put(sc.nextInt() * 1000 - sc.nextInt(), "A");
    	m.put(sc.nextInt() * 1000 - sc.nextInt(), "B");
    	m.put(sc.nextInt() * 1000 - sc.nextInt(), "C");
    	for(Integer k : m.keySet()) {
            System.out.println(m.get(k));
        }
    }
}
