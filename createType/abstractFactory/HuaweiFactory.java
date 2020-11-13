package createType.abstractFactory;

/**
 * @author Sundongdong
 */
public class HuaweiFactory implements AbstractFactory{

	@Override
	public IKeyboard createKeyboard() {
		return new HuaweiKeyboard();
	}

	@Override
	public IMouse createMouse() {
		return new HuaweiMouse();
	}
}
