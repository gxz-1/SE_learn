package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_learn {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();// ����ʹ�÷��ͣ�Ĭ��ΪObject
		list.add(666);
		list.add("111");// �ɴ�����������

		Iterator it = list.iterator();// �����÷��ͣ�������Ҳ����
		while (it.hasNext()) {
			Object object = it.next();// ȡ����Ԫ��Ĭ��ΪObject����
			System.out.println(object);
		}
		
		//�Զ��巺����
		myGeneric<Integer> gc=new myGeneric<>();
		gc.setName(2333);
		System.out.println(gc.getName());
		
		//�Զ��巺�ͷ���
		Generic_learn.myGenericmethod(123);
		Generic_learn.myGenericmethod('h');//��ʲô���;���ʲô����
	}
	
	//�Զ��巺�ͷ���
	public static<M> void myGenericmethod(M m) {
		// TODO Auto-generated method stub
		System.out.println(m);
	}
	

}

//�Զ��巺��
class myGeneric<E>{
	private E name;

	/**
	 * @return the name
	 */
	public E getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(E name) {
		this.name = name;
	}
	
}