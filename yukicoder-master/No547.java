import java.util.*;
import java.util.stream.Stream;
import java.time.*;
import java.time.format.*;

public class No547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] s = sc.nextLine().split(" ", 0);
		String[] t = sc.nextLine().split(" ", 0);
		// for(int i = 0; i < n; i++) {
		// 	System.out.println(s[i]);
		// }
		for(int i = 0; i < n; i++) {
			if(!s[i].equals(t[i])) {
				System.out.println(i + 1);
				System.out.println(s[i]);
				System.out.println(t[i]);
				return;
			}
		}
	}
}
