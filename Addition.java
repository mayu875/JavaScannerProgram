
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number A ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Number B ");
		int b = Integer.parseInt(sc.nextLine());

		System.out.println("Addition = " +(a+b));

	}
}
