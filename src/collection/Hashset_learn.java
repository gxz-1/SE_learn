package collection;

import java.util.HashSet;
import java.util.Set;
/*
 * Hashset
 * �����ظ��������������˳����ܲ�һ��
 * �ײ��ϣ��ʵ��
 */

public class Hashset_learn {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(6);
		s.add(3);
		s.add(4);
		//���������һ��
		for (Integer integer : s) {
			System.out.println(integer);
		}

		// Object���� int hashcode()���ض���Ĺ�ϣֵ�����ض���������ַ
		// ��tostring()�����з���ֵ����"������@��ϣֵ"
		// Stringʵ����д��hashcode()����
		// Hashset����hashcode()���ݹ�ϣֵ�洢�������У�����equal()�жϣ������ֹ�ϣ��ͻʱС��8�������������ú������

		// �����Զ�������
		HashSet<people> h = new HashSet<people>();

		people p1 = new people(18, "С��");
		people p2 = new people(18, "С��");
		people p3 = new people(20, "С��");
		
		System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
		System.out.println("p1.equals(p2)="+p1.equals(p2));
		System.out.println("p2.equals(p3)="+p2.equals(p3));
		//��дʹp1,p2��hashcode����ֵ��ͬ��toequal()�ж���ͬ���Ӷ�p2������
		h.add(p1);
		h.add(p2);
		h.add(p3);
		//��д��tostring����
		System.out.println(h);
	}

}

// �����Զ�������Ԫ�� ����дtostring(),hashcode()
class people {
	private int age;
	private String name;

	public people(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		people other = (people) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "people [age=" + age + ", name=" + name + "]";
	}

}
