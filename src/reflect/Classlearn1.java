package reflect;

import java.lang.reflect.Field;

/*
 * 1.获取成员变量们
 * Field[] getFields()      				---获取所有public修饰的成员变量
 * Field[] getField(String name)			---获取指定名称（name）的单个成员变量
 * 
 * Field[] getDeclaredFields()				---获取所有成员变量，不考虑修饰符
 * Field[] getDeclaredFields(String name)	---获取单一名字的成员变量，不考虑修饰符
 */

class Classlearn1{
	public static void main(String[] args) throws Exception{
		//0. 获取person的Class对象
		Class personClass=Person.class;

		
		Field[] fields = personClass.getFields();//获取所有public变量
		System.out.print("获取所有public变量:");
		for (Field field : fields) {
			System.out.print(field+" ");
		}
		System.out.println();
		
		Field field = personClass.getField("name");//可能获取不到，抛出异常
		//get 方法获取
		Person person = new Person("张三", 20, 2333,"北京");
		Object object = field.get(person);//get方法获取成员变量的值，传入成员变量所在的类对象
		System.out.println(object);
		//set 方式设置
		field.set(person, "李四");//传入类对象和修改的值
		System.out.println(person);
		
		System.out.println("--------------------------------------------------");
		
		Field[] declaredFields = personClass.getDeclaredFields();//获取所有成员变量，不考虑修饰符
		System.out.print("获取所有成员变量:");
		for (Field field2 : declaredFields) {
			System.out.print(field2);
		}System.out.println();
		
		Field declaredField = personClass.getDeclaredField("home");//获取单一名字的成员变量，不考虑修饰符
		//home为私有变量,不允许在类外访问，get会抛出异常
		declaredField.setAccessible(true);//忽略权限访问符的安全检查，暴力反射
		Object object2 = declaredField.get(person);
		System.out.println(object2);
		
		declaredField.set(person, "上海");
		System.out.println(person);
	}
}