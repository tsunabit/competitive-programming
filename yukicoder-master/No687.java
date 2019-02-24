import java.util.*;
import java.util.stream.Stream;
import java.time.*;
import java.time.format.*;

public class No687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println(n/2 + " " + n/2);
        }else {
            System.out.println((n/2 + 1) + " " + n/2);
        }
	}
}
