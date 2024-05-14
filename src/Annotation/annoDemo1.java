package Annotation;

/*
 * 注解的作用
 * 1. 编写doc文档: 命令行下 javadoc 文件名.java
 * 2. 代码分析:如使用反射
 * 3. 编译检查，如override,检查是否为重写的方法
 */

/**
 * 注解javadoc的演示
 * 
 * @author gxz
 * @version 1.8
 * @since   11.11
 */


/**
 * JDK中预定义的注解
 * @override:检测被注解的方法是否继承于父类
 * @Deprecated:表示标记的内容已经过时
 * @SuppressWarnings("all"):压制警告，一般用在类前,传入all参数表示压制类中所有的警告
 */
public class annoDemo1 {
	/**
	 * 计算两数的和
	 * @param a 整数
	 * @param b 整数
	 * @return 两数的和
	 */
	public int add(int a,int b) {
		return a+b;
	}
}
