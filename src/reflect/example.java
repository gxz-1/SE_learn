package reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

//дһ����ܣ����Դ���������Ķ��󣬲�ִ���������ⷽ��(ǰ��:���ܸı������κδ���)
class example {
	public static void main(String[] args) throws Exception {
	//1. ���������ļ�
		//1.1����Properties����
		Properties pro=new Properties();//��ȡpro.properties���ڴ�
		//1.2���������ļ���ת��Ϊ���� 
		ClassLoader classLoader = example.class.getClassLoader();//��ȡ������������
		InputStream is= classLoader.getResourceAsStream("pro.properties");//�����ļ�Ҳλ�������������·���£���getResourceAsStream��ȡ���ļ�
		pro.load(is);//���������ļ�
		
	//2. ��ȡ�����ļ��ж��������
		String classname = pro.getProperty("className");
		String classmethod = pro.getProperty("methodName");
		
	//3. ���ظ�����ڴ�
		Class cls=Class.forName(classname);
	//4.��������ʵ������
		Object obj = cls.newInstance();//Ҫ��������޲ι���
	//5.��ȡ��������
		Method method = cls.getDeclaredMethod(classmethod);//�˴����Ʊ���Ϊ�޲η���
		method.setAccessible(true);//��������
	//6.ִ�з���
		method.invoke(obj);
	}
}
