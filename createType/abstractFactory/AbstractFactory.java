package createType.abstractFactory;

/**
 * @author SunDongdong
 */
public interface AbstractFactory {
	public abstract IKeyboard createKeyboard();
	public abstract IMouse createMouse();
}

