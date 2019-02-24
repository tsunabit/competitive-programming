import java.util.*;
import java.util.stream.Stream;

public class No516 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i = 0; i < 3; i++) {
			if("RED".equals(sc.next())) {
				count++;
			}
		}
		System.out.println(count > 1 ? "RED" : "BLUE");
	}
}
