import java.util.*;
import java.io.*;
import java.math.*;

public class No5_input_is_file {    
    public static void main(String[] args) {
    	try {
    		// 入力元がファイルの場合
    		 Scanner sc = new Scanner(new File("/Users/aa352872/Desktop/test"));
    		// 入力元が標準入力の場合
//    		Scanner sc = new Scanner(System.in);
    		int n = sc.nextInt();
    		
    	}catch (Exception e) {
    		System.out.println("例外が発生しました。");
            System.out.println(e);
            return;
    	}
    }
}
