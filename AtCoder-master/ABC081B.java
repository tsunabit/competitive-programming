import java.util.*;
import java.util.stream.Stream;

public class ABC081B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] a = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		boolean hantei = true;
		int count = 0;
		while(true) {
				hantei = kei(a , n);
				if(hantei == false) {
						System.out.println(count);
						break;
				}
				count++;
		}
	}
	public static boolean kei(int[] a , int n) {
		for(int i = 0 ; i < n ; i++) {
			if(a[i] % 2 != 0) {
				return false;
			}else {
				a[i] = a[i] / 2;
			}
		}
		return true;
	}
}

