import java.util.*;
import java.util.stream.Stream;
import java.time.*;
import java.time.format.*;

public class No632 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String c1 = sc.next();
		String c2 = sc.next();
		String c3 = sc.next();
		if("2".equals(c2)) {
			System.out.println("4");
		}else if("3".equals(c2)) {
			System.out.println("1");
		}else {
			System.out.println("14");
		}
	}
}
