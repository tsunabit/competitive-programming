import java.util.*;
import java.util.stream.Stream;

public class No486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char temp = 'R';
		int count = 0;
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			if(temp == s.charAt(i)) {
					count++;
			}else {
					temp = s.charAt(i);
					count = 1;
			}
			if(count == 3) {
					System.out.println(temp == 'O' ? "East" : "West");
					return;
			}
		}
		System.out.println("NA");

	}
}
