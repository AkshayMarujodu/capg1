package reversethestring;

import java.util.Scanner;

public class reversethestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder s=new StringBuilder(a);
        System.out.println(s.reverse());
        
	}

}