package specialforce.string;

import java.util.HashMap;
import java.util.Map;

public class TestNum {

	public static void testSwitch() {
		// ����ab����
		int a = 103;
		int b = 255;
		System.out.println("a=" + a + ",b=" + b);

		// ���ݵ��Ӻ������������Խ��
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a=" + a + ",b=" + b);

		// ������㣬Ч�ʼ���
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
