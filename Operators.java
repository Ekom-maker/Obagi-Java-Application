public class Operators{
	public static void main(String[] args) {
		//Assignment operator(=)
		
		int num1 = 13;
		int num2 = 5;
		
		num1 += num2;
		
		//Arithmetic operator(+,*,-,/,%)
		int sum = num1 + num2;
		
		int product = num1*num2;
		
		int difference = num1 - num2;
		
		double quotient = (double)num1 / num2;
		
		int remainder = num1 % num2;
		
		//Relational Operator(>,<,>=,<=,==,!=)
		boolean isLessThan = num1 < num2;
		boolean isGreaterThan = num1 > num2;
		boolean isGreaterThanOrEqualTo = num1 >= num2;
		boolean isLessThanOrEqualTo = num1 <= num2;
		boolean isEqualTo = num1 == num2;
		boolean isNotEqualTo = num1 != num2;
		
		System.out.printf("The sum of the numbers is %d%n", sum);
		System.out.printf("The product of the numbers is %d%n", product);
		System.out.printf("The difference between the two numbers is %d%n",num1,num2,difference);
		System.out.printf("The quotient is %.1f%n",quotient);
		System.out.printf("The remainder is %d%n",remainder);
		System.out.printIn("===================================================");
		System.out.printIn("%nIs %d < %d? %b%n",num1,num2,isLessThan);
		System.out.printIn("Is %d > %d? %b%n",num1,num2,isGreaterThan);
		System.out.printIn("Is %d >= %d? %b%n",num1,num2,isGreaterThanOrEqualTo);
		System.out.printIn("Is %d <= %d? %b%n",num1,num2,isLessThanOrEqualTo);
		System.out.printIn("Is %d == %d? %b%n",num1,num2,isEqualTo);
		System.out.printIn("Is %d != %d? %b%n",num1,num2,isNotEqualTo);
	}
}