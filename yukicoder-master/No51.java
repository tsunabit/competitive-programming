import java.util.*;
import java.util.stream.Stream;
import java.time.*;
import java.time.format.*;

public class No51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long w = sc.nextInt(), d = sc.nextInt();
        for(long i = d; i > 1; i--) {
            //System.out.println(w / (Math.pow(i, 2)));
            w -= (int)(w / (i * i));
            //System.out.println(i + " " + w);
        }
        System.out.println(w);
    }
}
