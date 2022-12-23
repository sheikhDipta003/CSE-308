package State_Pattern.Vending_machine;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine(5);
		Scanner scanner = new Scanner(System.in);

		System.out.println(vendingMachine);
		while(true){
			System.out.print("Enter amount: ");
			int a = Integer.parseInt(scanner.nextLine());
			if(a < 0) break;
			boolean isInNoQuarter = vendingMachine.insertAmount(a);
			if(!isInNoQuarter) vendingMachine.refill(5);
			System.out.println(vendingMachine);
		}
	}
}
