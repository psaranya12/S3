package program;
import java.util.Scanner;

public class Alpha {
public static void main(String[] args) {
		char ch;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		ch=in.next().charAt(0);
		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))
		{
			System.out.println("The given character is alphabet");
		}
		else{
			System.out.println("The given character is not alphabet");
		}
	}

}




