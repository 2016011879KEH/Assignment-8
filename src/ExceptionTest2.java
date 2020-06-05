import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("Enter a number!");
		try {
			int num = getNum();
		}
		catch(InputMismatchException e) {
			System.out.println("Error! enter a integer!");
		}
		catch(MyException e) {
			System.out.println("Odd number");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}

	public static int getNum() throws InputMismatchException, MyException{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(num % 2 !=0) {
			throw new MyException();
		}
		else {
			System.out.println("Even number");
		}
		return num;
	}
}
