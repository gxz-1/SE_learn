package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * java.util.Iterator�ӿڣ����������Լ��Ͻ��б�����
	���������õķ���
	boolean hasNext�����������Ԫ�ؿ��Ե������򷵻�true��
	false E next�������ص�������һ��Ԫ�ء�
	collection�ӿ�����-һ����������iterator������
	����������صľ��ǵ�������ʵ�������Iterator<E> iterator���������ڴ�collection ��Ԫ���Ͻ��е����ĵ�������
 * 
 */

public class iterator_learn {

	public static void main(String[] args) {
		//��������
		Collection<String> c=new ArrayList<>();
		c.add("aa");
		c.add("bb");
		c.add("cc");
		//����������
		Iterator<String> it=c.iterator();
		//��������
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//����ǿforѭ��
		for (String string : c) {
			System.out.println(string);
		}
		
	}




}
