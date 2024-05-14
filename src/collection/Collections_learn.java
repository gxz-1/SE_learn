package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * ��Collections(����Collection)�з�װ����ྲ̬����
 * �� shuffle()����˳�� 
 * 	  addall(list,args)��list���������Ԫ��
 * 	  sort()����
 */
public class Collections_learn {
	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<>();
		Collections.addAll(c, "��", "������");// ��c����Ӷ��Ԫ��
		Collections.shuffle(c);
		Collections.sort(c);

		ArrayList<animal> aaa = new ArrayList<animal>();
		animal a1 = new animal("è", 1);
		animal a2 = new animal("��", 3);
		animal a3 = new animal("Ѽ", 2);
		Collections.addAll(aaa, a1, a2, a3);//
		Collections.sort(aaa);//����������
	}

}

//���Զ�������������ʵ��Comparable�ӿڣ���дcompareTo����
class animal implements Comparable<animal> {
	private String name;
	private int age;

	@Override
	public int compareTo(animal o) {
		// TODO Auto-generated method stub
		return age - o.age;// ����
	}

	public animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}