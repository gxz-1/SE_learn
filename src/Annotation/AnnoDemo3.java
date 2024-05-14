package Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Ԫע�⣺���ڱ���ע���ע�� 
 * @target:����ע�������õ�λ��
 * 		ElementType.TYPE   ��ʾ��������
 * 		ElementType.METHOD ��ʾ�����ڷ���
 * 		ElementType.FIELD  ��ʾ����������	
 * @Retention:����ע�ⱻ�����ĵĽ׶�
 * 		RetentionPolicy.RUNTIME ��ʾ��������ע��ᱣ����Class�ֽ����ļ��в���JVM��ȡ��
 * 		RetentionPolicy.CLASS   ��ʾ��������ע��ᱣ����Class�ֽ����ļ���,������JVM��ȡ��
 * 		RetentionPolicy.SOURCE  ��ʾ��������ע�ⲻ�ᱣ����Class�ֽ����ļ���
 * @documented:����ע���Ƿ񱻳�ȡ��api�ĵ���
 * @inherited:����ע���Ƿ�����̳�
 */

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnoDemo3{
	
}