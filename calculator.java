package calculator;


import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculator");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
calculator obj=new calculator();
 obj.display(a,b);

	}
	void display( int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}

}
