package palindromestring;


import java.util.Scanner;

public class palindromestring {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string");
		String a=sc.nextLine();
		StringBuilder b=new StringBuilder(a);
		StringBuilder c=b.reverse();
		System.out.println(c);
		if(a.equals(c)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}