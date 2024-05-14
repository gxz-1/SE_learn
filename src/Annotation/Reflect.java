package Annotation;

//用注解代替配置文件实现反射 

@Pro(classname = "Annotation.Student", methodName = "drink")
public class Reflect {
public static void main(String[] args) {
	//1. 解析注解
	//  1.1获取该类的字节码文件对象
	Class<Reflect> r=Reflect.class;
	//  1.2获取该类上注解对象
	Pro objPro=r.getAnnotation(Pro.class);
	//  1.3调用注解对象中定义的抽象方法，获取返回值
	String classname=objPro.classname();
	String methodName=objPro.methodName();
	System.out.println(classname+"   "+methodName);
}
}
