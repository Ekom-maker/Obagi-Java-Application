public class Classwork2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		
		System.out.printIn("Enter 10 numbers:");
		for (int i = 0; i <= 10; i++){
			numbers[i] = scanner.nextInt();
		}
		
		int sum6to8 = numbers[5] + numbers[6] + numbers[7];
		int sum4to9 = numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9];
		int difference = sum4to9 - sum6to8;
		int result = difference - numbers[6];
		System.out.printIn("Results:" + result);
		
		scanner.close();
	}
}