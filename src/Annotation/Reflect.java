package Annotation;

//��ע����������ļ�ʵ�ַ��� 

@Pro(classname = "Annotation.Student", methodName = "drink")
public class Reflect {
public static void main(String[] args) {
	//1. ����ע��
	//  1.1��ȡ������ֽ����ļ�����
	Class<Reflect> r=Reflect.class;
	//  1.2��ȡ������ע�����
	Pro objPro=r.getAnnotation(Pro.class);
	//  1.3����ע������ж���ĳ��󷽷�����ȡ����ֵ
	String classname=objPro.classname();
	String methodName=objPro.methodName();
	System.out.println(classname+"   "+methodName);
}
}
