import java.util.Scanner;

public class ClassworkWhile{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = scan.nextInt();
		
		System.out.println("Multiplication table:");
		for(int i = 1; i <= 12; i++) {
			System.out.printf(num + " x " + i + " = " + (num * i) + "%n");
		}
	}
}