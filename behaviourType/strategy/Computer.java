package behaviourType.strategy;

public class Computer {
	protected IPurchase purchase;
	public Computer(){

	}
	public Computer(IPurchase purchase){
		this.purchase = purchase;
	}
	public void setPurchase(IPurchase purchase){
		this.purchase = purchase;
	}
	public void showPurchase(){
		purchase.show();
		System.out.println("买了一个电脑");
	}
}
