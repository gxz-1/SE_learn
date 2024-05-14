package reflect;

import java.lang.reflect.Method;

/*
 * 2.获取成员方法们
 * Method[] getMethods()      									---获取所有public修饰的成员方法
 * Method[] getmethod(String name,类<?>...parameterTypes)			---获取指定名称（name）的单个成员变量
 * 
 * Method[] getDeclaredmethods()							  		---获取所有成员变量，不考虑修饰符
 * Method[] getDeclaredmethods(String name，类<?>...parameterTypes)---获取单一名字的成员变量，不考虑修饰符
 */

public class Classlearn2  {
	public static void main(String[] args) throws Exception {
		Class personClass=Person.class;
		Method method = personClass.getMethod("eat",String.class,String.class);//传入方法名和方法传入参数的类
		//invoke 执行方法
		Person person=new Person("王五", 22, 66666, "香港");
		method.invoke(person,"南京","脆皮鸭");//传入方法对应的类对象 和 方法传入参数的对象
		
		Method[] methods = personClass.getMethods();//获取所有public方法 包括父类的方法
		System.out.print("包含的方法名有:");
		for (Method method2 : methods) {
			System.out.print(method2.getName()+" ");//getname获取方法名
		}System.out.println();
		
		//获取类名
		System.out.println("类名为:"+personClass.getName());
	}

}
