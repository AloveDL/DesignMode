package createType.abstractFactory;

/**
 * @author SunDongdong
 */
public class Test {
	public static void main(String[] args) {
		AbstractFactory Huawei = new HuaweiFactory();
		AbstractFactory Lenovo = new LenovoFactory();
		Huawei.createKeyboard().create();
		Huawei.createMouse().create();
		Lenovo.createKeyboard().create();
		Lenovo.createMouse().create();
	}
}
