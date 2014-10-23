package specialforce.string;

public class TestString {

	private static void test1() {
		System.out.println("test1==================");
		String a = "a" + "b" + 1;
		String b = "ab1";
		System.out.println(a == b);

	}

	private static void test2() {
		System.out.println("test2==================");
		String s1 = "a";
		final String s2 = "a";
		String s3 = s1 + "b";
		String s4 = s2 + "b";
		String s5 = getA() + "b";
		String ab = "ab";
		//�������Ż���һ�����ܹ��ڱ���׶�ȷ�������Ӱ�칦��
		System.out.println(s3 == ab);//���������Ż�����
		System.out.println(s4 == ab);// ����final���Ͳ��ɱ䣬�������Ż�
		System.out.println(s5 == ab);//���������Ż���������ֵ

	}

	private static void test3() {
		System.out.println("test3==================");
		String s1 = "a";
		String s2 = s1+"b";
		String s3 = "ab";
		String s4 = new String(s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s3==s4.intern());
		System.out.println(s2.intern()==s4.intern());

	}

	private static String getA() {
		return "a";
	}

	public static void main(String[] args) {
		test1();

		test2();
		
		test3();
	}

}
