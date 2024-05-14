package reflect;

import java.lang.reflect.Field;

/*
 * 1.��ȡ��Ա������
 * Field[] getFields()      				---��ȡ����public���εĳ�Ա����
 * Field[] getField(String name)			---��ȡָ�����ƣ�name���ĵ�����Ա����
 * 
 * Field[] getDeclaredFields()				---��ȡ���г�Ա���������������η�
 * Field[] getDeclaredFields(String name)	---��ȡ��һ���ֵĳ�Ա���������������η�
 */

class Classlearn1{
	public static void main(String[] args) throws Exception{
		//0. ��ȡperson��Class����
		Class personClass=Person.class;

		
		Field[] fields = personClass.getFields();//��ȡ����public����
		System.out.print("��ȡ����public����:");
		for (Field field : fields) {
			System.out.print(field+" ");
		}
		System.out.println();
		
		Field field = personClass.getField("name");//���ܻ�ȡ�������׳��쳣
		//get ������ȡ
		Person person = new Person("����", 20, 2333,"����");
		Object object = field.get(person);//get������ȡ��Ա������ֵ�������Ա�������ڵ������
		System.out.println(object);
		//set ��ʽ����
		field.set(person, "����");//�����������޸ĵ�ֵ
		System.out.println(person);
		
		System.out.println("--------------------------------------------------");
		
		Field[] declaredFields = personClass.getDeclaredFields();//��ȡ���г�Ա���������������η�
		System.out.print("��ȡ���г�Ա����:");
		for (Field field2 : declaredFields) {
			System.out.print(field2);
		}System.out.println();
		
		Field declaredField = personClass.getDeclaredField("home");//��ȡ��һ���ֵĳ�Ա���������������η�
		//homeΪ˽�б���,��������������ʣ�get���׳��쳣
		declaredField.setAccessible(true);//����Ȩ�޷��ʷ��İ�ȫ��飬��������
		Object object2 = declaredField.get(person);
		System.out.println(object2);
		
		declaredField.set(person, "�Ϻ�");
		System.out.println(person);
	}
}