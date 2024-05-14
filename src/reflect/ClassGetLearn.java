package reflect;
//获取类对象的方式
/*
 * 1. Class.forname("全类名")  ---将字节码文件加载进内存，返回Class对象
 * 2. 类名.Class				 ---该类已经加载进内存，用该类的属性class获取
 * 3. 对象.getClass()			 ---该类已实例化为对象，用对象的getClass方法获取
 */
public class ClassGetLearn {
	public static void main(String[] args) throws Exception {
		//法一
		Class personClass1=Class.forName("reflect.Person");//将Person类加载进内存 需要使用全类名
		//法二
		Class personclass2=Person.class;
		//法三
		Object obj= personclass2.newInstance();//将该类实例化
		Class personClass3=obj.getClass();
		
		//同一个字节码文件在一次程序中只加载一次，无论用哪种方法获取的CLass对象都是同一个
		//System.out.println(personClass1==personclass2);
		System.out.println(personclass2==personClass3);
	}
}
