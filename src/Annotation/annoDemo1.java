package Annotation;

/*
 * ע�������
 * 1. ��дdoc�ĵ�: �������� javadoc �ļ���.java
 * 2. �������:��ʹ�÷���
 * 3. �����飬��override,����Ƿ�Ϊ��д�ķ���
 */

/**
 * ע��javadoc����ʾ
 * 
 * @author gxz
 * @version 1.8
 * @since   11.11
 */


/**
 * JDK��Ԥ�����ע��
 * @override:��ⱻע��ķ����Ƿ�̳��ڸ���
 * @Deprecated:��ʾ��ǵ������Ѿ���ʱ
 * @SuppressWarnings("all"):ѹ�ƾ��棬һ��������ǰ,����all������ʾѹ���������еľ���
 */
public class annoDemo1 {
	/**
	 * ���������ĺ�
	 * @param a ����
	 * @param b ����
	 * @return �����ĺ�
	 */
	public int add(int a,int b) {
		return a+b;
	}
}
