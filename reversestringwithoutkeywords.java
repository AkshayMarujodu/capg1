package reversestringwithoutkeywords;

import java.util.Scanner;

public class reversestringwithoutkeywords{

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a.charAt(5));
        for( i=a.length();i>0;i--) {
        	System.out.println(a.charAt(i-1));
        }
       
	}

}