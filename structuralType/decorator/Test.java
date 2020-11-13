package structuralType.decorator;

public class Test {
	public static void main(String[] args) {
		IComputer huawei = new Keyboard(new HuaweiComputer());
		IComputer lenovo = new Mouse(new HuaweiComputer());
		IComputer huaweiPro = new Keyboard(new Mouse(new HuaweiComputer()));
		System.out.println("------------------------------------------------");
		huawei.show();
		System.out.println("------------------------------------------------");
		lenovo.show();
		System.out.println("------------------------------------------------");
		huaweiPro.show();
		System.out.println("------------------------------------------------");
	}
}
