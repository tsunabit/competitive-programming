import java.util.*;
import java.util.stream.Stream;
import java.time.*;
import java.time.format.*;

public class No570 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(sc.nextInt(), "A");
		map.put(sc.nextInt(), "B");
		map.put(sc.nextInt(), "C");
		Object[] key = map.keySet().toArray();
		Arrays.sort(key, Collections.reverseOrder());
		// Arrays.sort(key);
		for(int i = 0; i <3; i++) {
			System.out.println(map.get(key[i]));
		}
	}
}
