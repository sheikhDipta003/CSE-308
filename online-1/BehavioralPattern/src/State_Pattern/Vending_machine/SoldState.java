package State_Pattern.Vending_machine;

public class SoldState implements State {
	VendingMachine vendingMachine;
 
    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

	public void insertAmount() {
		System.out.println("Please wait, we're already giving you a cold drink");
	}
 
	public void ejectExcessAmount() {
		System.out.println("Sorry, order cannot be taken back.");
	}

	@Override
	public void promptForExactAmount() {}

	public void dispense() {		//false if goes to noQuarter state, true if goes to soldState
		vendingMachine.releaseBall();
		if (vendingMachine.getCount() > 0) {
			vendingMachine.setState(vendingMachine.getNoQuarterState());
		}
		else {
			System.out.println("Out of cold drinks.");
			vendingMachine.setState(vendingMachine.getSoldOutState());
		}
	}
	
	public void refill() { }
 
	public String toString() {
		return "DISPENSING A COLD DRINK";
	}
}


