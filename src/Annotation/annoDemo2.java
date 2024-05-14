package Annotation;

/**
 * 自己创建注解 
 * 格式： 
 * 元注解 
 * public @interface 注解名称{}
 * 
 */

/**
 * 注解的本质：
 *public interface annoDemo2 extends java.lang.annotation.Annotation {} 
 *本质上就是继承Annotation这个类的接口
 */

/**
 * 注解的属性---接口中可以定义的内容
 * 要求：
 * 	1. 属性的返回值：基本数据类型、String、枚举、注解、以上类型的数组
 *  2. 如果只有一个属性需要赋值，且属性的名称为value，可在使用注解时省略 value= 直接写value的值
 *  3. 使用数组作为属性时，用{}包裹，当只有数组中只有一个元素，可省略{}
 */


public @interface annoDemo2 {
	int show2();		//基本数据类型
	String show1();		//字符串类型
	Person show3();		//枚举类型
	Override show4();	//注解
	String[] show5();	//以上类型的数组
	
	int age() default 666;//default赋默认初始值
}

//使用时将注释的属性补全
@annoDemo2(show1 = "", show2 = 0, show3 = Person.p1, show4 = @Override, show5 = { "" })
class example{}




