import java.util.*;
import java.io.*;
import java.math.*;

public class No628 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	for(int i = 0; i < n; i++) {
    		int no = sc.nextInt();
    		int m = sc.nextInt(), s = sc.nextInt();
    		for(int j = 0; j < m; j++) {
    			String t = sc.next();
    			if(map.containsKey(t)) map.put(t, map.get(t) + s);
    			else map.put(t, s);    					
    		}
    	}
    	ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String, Integer>>();
    	for(Map.Entry<String, Integer> entry : map.entrySet()) {
    		al.add(entry);
    	}
    	Collections.sort(al, new Comparator<Map.Entry<String, Integer>>() {
            //compareを使用して値を比較する
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
                //降順
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
    	
    	ArrayList<Integer> vl = new ArrayList<Integer>();
    	String[] k = new String[al.size()];
    	int[] v = new int[al.size()];
    	int c = 0;
    	for(Map.Entry<String, Integer> entry : al) {
    		vl.add(entry.getValue());
    		k[c] = entry.getKey();
    		v[c] = entry.getValue();
    		c++;
    	}
    	for(int i = 0; i < v.length; i++) {
    		if(vl.indexOf(v[i]) != vl.lastIndexOf(v[i])) {
    			int sa = vl.lastIndexOf(v[i]) - vl.indexOf(v[i]) + 1;
    			String[] s = new String[sa];
    			for(int j = 0; j < sa; j++) {
    				s[j] = k[vl.indexOf(v[i]) + j];
    			}
    			Arrays.sort(s);
    			for(int j = vl.indexOf(v[i]); j <= vl.lastIndexOf(v[i]); j++) {
    				k[j] = s[j - vl.indexOf(v[i])];
    			}
    		}
    	}
    	int max = v.length > 10? 10 : v.length;
    	for(int i = 0; i < max; i++) {
    		System.out.println(k[i] + " " + v[i]);
    	}
    }
}
