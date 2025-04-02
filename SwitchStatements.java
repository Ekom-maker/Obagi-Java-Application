public class SwitchStatement{
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		System.out.printIn("Enter *131# To Subscribe Data");
		System.out.printIn("Enter *310# To Check Balance");
		System.out.printIn("Enter *606# To Borrow Data");
		
		System.out.
		String code = input.nextLine();
		
		switch(code){
			case "*131#":
			{
				System.out.printIn("Enter 1 for 1 month subscription");
				System.out.printIn("Enter 2 for 2 months subscription");
				System.out.printIn("Enter 3 for 3 months subscription");
				System.out.printIn("Enter 4 for 4 months subscription");
				
				Int option = input.nextInt ();
				
				switch(option){
					case 1:
					{
					System.out.printIn("Your 1 month subscription has been activated");
					}
					break;
					
					case 2:
					{
					System.out.printIn("Your 2 months subscription has been activated");
					}
					break;
					
					case 3:
					{
					System.out.printIn("Your 3 months subscription has been activated");
					}
					break;
					
					case 4:
					{
					System.out.printIn("Your 4 months subscription has been activated");
					}
					break;
					
					default:
					System.out.printIn("Invalid input");
				}
				
			}
			break;
			
			case "*310#":
			{
				System.out.printIn("Your balance is : N764.89");
				
			}
			break;
			
			case "*606#":
			{
				System.out.printIn("Enter 1 for 1000");
				System.out.printIn("Enter 2 for 2000");
				System.out.printIn("Enter 3 for 3000");
				System.out.printIn("Enter 4 for 4000");
			
			
				Int option = input.nextInt ();
				
				switch(option){
					case 1:
					{
					System.out.printIn("Your 1 month subscription has been borrowed");
					}
					break;
					
					case 2:
					{
					System.out.printIn("Your 2 months subscription has been borrowed");
					}
					break;
					
					case 3:
					{
					System.out.printIn("Your 3 months subscription has been borrowed");
					}
					break;
					
					case 4:
					{
					System.out.printIn("Your 4 months subscription has been borrowed");
					}
					break;
					
					default:
					System.out.printIn("Invalid input");
				}
			}
			break;
		}
	}
}