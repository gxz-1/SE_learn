package Annotation;

/**
 * �Լ�����ע�� 
 * ��ʽ�� 
 * Ԫע�� 
 * public @interface ע������{}
 * 
 */

/**
 * ע��ı��ʣ�
 *public interface annoDemo2 extends java.lang.annotation.Annotation {} 
 *�����Ͼ��Ǽ̳�Annotation�����Ľӿ�
 */

/**
 * ע�������---�ӿ��п��Զ��������
 * Ҫ��
 * 	1. ���Եķ���ֵ�������������͡�String��ö�١�ע�⡢�������͵�����
 *  2. ���ֻ��һ��������Ҫ��ֵ�������Ե�����Ϊvalue������ʹ��ע��ʱʡ�� value= ֱ��дvalue��ֵ
 *  3. ʹ��������Ϊ����ʱ����{}��������ֻ��������ֻ��һ��Ԫ�أ���ʡ��{}
 */


public @interface annoDemo2 {
	int show2();		//������������
	String show1();		//�ַ�������
	Person show3();		//ö������
	Override show4();	//ע��
	String[] show5();	//�������͵�����
	
	int age() default 666;//default��Ĭ�ϳ�ʼֵ
}

//ʹ��ʱ��ע�͵����Բ�ȫ
@annoDemo2(show1 = "", show2 = 0, show3 = Person.p1, show4 = @Override, show5 = { "" })
class example{}




