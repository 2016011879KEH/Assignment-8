import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			System.out.println("Please enter a two number!");
			Scanner input = new Scanner(System.in);
			int num1 = input.nextInt();
			int num2 = input.nextInt();

			int addresult;
			addresult=num1+num2;

			System.out.println("Add result = "+addresult);
		}
		catch(InputMismatchException e) {
			System.out.println("Error!");
		}
	}
}
