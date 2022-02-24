package duplicatecharacters;
import java.util.Scanner;

public class printduplicatecharacters {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[] c=a.toCharArray();
        System.out.println(c);

        for(int i=0;i<a.length();i++) {
        	for(int j=i+1;j<a.length();j++) {
        		if((c[i])==c[j]) {
        			System.out.println(c[j]);
        			break;
        		}
        	}
        }
	}
}
