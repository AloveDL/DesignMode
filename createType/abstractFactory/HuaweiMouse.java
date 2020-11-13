package createType.abstractFactory;

/**
 * @author SunDongdong
 */
public class HuaweiMouse implements IMouse{
	@Override
	public void create() {
		System.out.println("华为鼠标生产完成");
	}
}
