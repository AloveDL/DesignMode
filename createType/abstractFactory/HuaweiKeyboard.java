package createType.abstractFactory;

/**
 * @author SunDongdong
 */
public class HuaweiKeyboard implements IKeyboard{

	@Override
	public void create() {
		System.out.println("华为键盘生产完成");
	}
}
