package removecharactersinstring;

import java.util.Scanner;

public class removecharactersinstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
        String a=sc.nextLine();
        System.out.println("enter the characters to remove");
        String p=sc.nextLine(); 
    System.out.println(p.length());
        if(p.length()>=2) {
        	System.out.println("please enter a character to remove");
        }
        else {
          
       System.out.println( a.replaceAll(p, ""));
      
      

	}

}
}