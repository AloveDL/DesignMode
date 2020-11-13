package structuralType.decorator;

public class LenovoComputer implements IComputer{
	@Override
	public void show() {
		System.out.println("本产品为联想电脑");
	}
}
