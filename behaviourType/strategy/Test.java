package behaviourType.strategy;

public class Test {
	public static void main(String[] args) {
		Computer huawei1 = new Computer(new Taobao());
		Computer huawei2 = new Computer(new Jd());
		Computer huawei3 = new Computer(new Pdd());
		System.out.println("---------------------------------------");
		huawei1.showPurchase();
		System.out.println("---------------------------------------");
		huawei2.showPurchase();
		System.out.println("---------------------------------------");
		huawei3.showPurchase();
	}
}
