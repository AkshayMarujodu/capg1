package duplicatecharacters;
import java.util.Scanner;

public class duplicatecharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[] c=a.toCharArray();
        System.out.println(c);
int count=0;
        for(int i=0;i<a.length();i++) {
        	for(int j=i+1;j<a.length();j++) {
        		if((c[i])==c[j]) {
        			System.out.println("duplicates are: "+c[j]);
        			count++;
        			break;

	}

}
        }
        	   System.out.println("total number of duplicates are: "+count);
        }
}