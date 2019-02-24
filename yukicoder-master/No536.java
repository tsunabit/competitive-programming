import java.util.*;
import java.util.stream.Stream;
import java.time.*;
import java.time.format.*;

public class No536 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(s.length()-2) == 'a' && s.charAt(s.length()-1) == 'i') {
			for(int i = 0; i < s.length() - 2; i++) {
				System.out.print(s.charAt(i));
			}
			System.out.println("AI");
		}else {
			System.out.println(s + "-AI");
		}
	}
}
