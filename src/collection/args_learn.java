package collection;

/*
 * �ײ������� ���ݴ�������ݲ�ͬ��������ͬ���ȵ�����
 * 	�﷨��
 * 		���η� ����ֵ���� ����������������...��������{}
 * ������ֻ����һ���ɱ�������ұ�����ĩβ
 */

public class args_learn {

	public static void main(String[] args) {
		System.out.println(add(7,3,4,6));
	}

	public static int add(int...arr) {
		int result=0;
		for (int i : arr) {
			result+=i;
		}
		return result;
	}
}
