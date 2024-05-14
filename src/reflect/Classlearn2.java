package reflect;

import java.lang.reflect.Method;

/*
 * 2.��ȡ��Ա������
 * Method[] getMethods()      									---��ȡ����public���εĳ�Ա����
 * Method[] getmethod(String name,��<?>...parameterTypes)			---��ȡָ�����ƣ�name���ĵ�����Ա����
 * 
 * Method[] getDeclaredmethods()							  		---��ȡ���г�Ա���������������η�
 * Method[] getDeclaredmethods(String name����<?>...parameterTypes)---��ȡ��һ���ֵĳ�Ա���������������η�
 */

public class Classlearn2  {
	public static void main(String[] args) throws Exception {
		Class personClass=Person.class;
		Method method = personClass.getMethod("eat",String.class,String.class);//���뷽�����ͷ��������������
		//invoke ִ�з���
		Person person=new Person("����", 22, 66666, "���");
		method.invoke(person,"�Ͼ�","��ƤѼ");//���뷽����Ӧ������� �� ������������Ķ���
		
		Method[] methods = personClass.getMethods();//��ȡ����public���� ��������ķ���
		System.out.print("�����ķ�������:");
		for (Method method2 : methods) {
			System.out.print(method2.getName()+" ");//getname��ȡ������
		}System.out.println();
		
		//��ȡ����
		System.out.println("����Ϊ:"+personClass.getName());
	}

}
