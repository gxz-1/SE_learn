package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testadd {
	
	//������Դ�����룬���в��Է���ִ��֮ǰִ��
	@Before
	public void init() {
		System.out.println("init��ִ����");
	}
	
	//���в��Է���ִ������Զ�ִ�и÷������׳��쳣��ִ��
	@After
	public void close() {
		System.out.println("close��ִ����");
	}
	
	@Test
	public void Testadd(){
		System.out.println("���ǵ�һ������");
		//���������Զ���
		add a = new add();		
		//���� 
		int result=a.func(2, 1);
		assertEquals(3, result);//����,������ֵ������ֵ��ͬ����������ͬ�׳��쳣
	}
	
	@Test
	public void Testadd2() {
		System.out.println("���ǵڶ������Է���������ǰ��init��closeҲ�ͱ�ִ��");
	}
}
