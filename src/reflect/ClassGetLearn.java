package reflect;
//��ȡ�����ķ�ʽ
/*
 * 1. Class.forname("ȫ����")  ---���ֽ����ļ����ؽ��ڴ棬����Class����
 * 2. ����.Class				 ---�����Ѿ����ؽ��ڴ棬�ø��������class��ȡ
 * 3. ����.getClass()			 ---������ʵ����Ϊ�����ö����getClass������ȡ
 */
public class ClassGetLearn {
	public static void main(String[] args) throws Exception {
		//��һ
		Class personClass1=Class.forName("reflect.Person");//��Person����ؽ��ڴ� ��Ҫʹ��ȫ����
		//����
		Class personclass2=Person.class;
		//����
		Object obj= personclass2.newInstance();//������ʵ����
		Class personClass3=obj.getClass();
		
		//ͬһ���ֽ����ļ���һ�γ�����ֻ����һ�Σ����������ַ�����ȡ��CLass������ͬһ��
		//System.out.println(personClass1==personclass2);
		System.out.println(personclass2==personClass3);
	}
}
