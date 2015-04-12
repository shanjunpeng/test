package specialforce.string;

import java.util.HashMap;
import java.util.Map;

public class TestNum {

	public static void testSwitch() {
		// 变量ab交换
		int a = 103;
		int b = 255;
		System.out.println("a=" + a + ",b=" + b);

		// 数据叠加后减回来，可能越界
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a=" + a + ",b=" + b);

		// 异或运算，效率极高
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a=" + a + ",b=" + b);
	}

	public static void main(String[] args) {
		testSwitch();

		Map<Object, Object> map = new HashMap<>();
		map.put("1", "1");

	}

}
