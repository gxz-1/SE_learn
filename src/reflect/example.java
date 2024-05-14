package reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

//写一个框架，可以创建任意类的对象，并执行其中任意方法(前提:不能改变该类的任何代码)
class example {
	public static void main(String[] args) throws Exception {
	//1. 加载配置文件
		//1.1创建Properties对象
		Properties pro=new Properties();//读取pro.properties进内存
		//1.2加载配置文件，转换为集合 
		ClassLoader classLoader = example.class.getClassLoader();//获取该类的类加载器
		InputStream is= classLoader.getResourceAsStream("pro.properties");//配置文件也位于类加载器所在路径下，用getResourceAsStream获取流文件
		pro.load(is);//加载配置文件
		
	//2. 获取配置文件中定义的数据
		String classname = pro.getProperty("className");
		String classmethod = pro.getProperty("methodName");
		
	//3. 加载该类进内存
		Class cls=Class.forName(classname);
	//4.创建对象（实例化）
		Object obj = cls.newInstance();//要求必须有无参构造
	//5.获取方法对象
		Method method = cls.getDeclaredMethod(classmethod);//此处限制必须为无参方法
		method.setAccessible(true);//暴力反射
	//6.执行方法
		method.invoke(obj);
	}
}
