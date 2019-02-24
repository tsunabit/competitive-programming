import java.util.*;
import java.util.stream.Stream;
import java.time.*;
import java.time.format.*;

public class No716 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int pre = sc.nextInt();
        int sai = pre; 
        int sin = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            sin  = sc.nextInt();
            if(Math.abs(sin - pre) < min) {
                min = Math.abs(sin - pre);
            }
            pre = sin;
        }
        System.out.println(min + "\n" + (pre - sai));
	}
}
