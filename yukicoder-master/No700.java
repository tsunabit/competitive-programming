import java.util.*;
import java.util.stream.Stream;
import java.time.*;
import java.time.format.*;

public class No700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if(s.contains("LOVE")) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
	}
}
