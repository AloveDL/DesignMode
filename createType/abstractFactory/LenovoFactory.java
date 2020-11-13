package createType.abstractFactory;
/**
 * @author SunDongdong
 */
public class LenovoFactory implements AbstractFactory{
	@Override
	public IKeyboard createKeyboard() {
		return new LenovoKeyboard();
	}

	@Override
	public IMouse createMouse() {
		return new LenovoMouse();
	}
}
