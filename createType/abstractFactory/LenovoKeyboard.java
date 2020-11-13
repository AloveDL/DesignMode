package createType.abstractFactory;

/**
 * @author SunDongdong
 */
public class LenovoKeyboard implements IKeyboard{
	@Override
	public void create() {
		System.out.println("联想键盘生产完成");
	}
}
