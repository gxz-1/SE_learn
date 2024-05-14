package collection;

/*
 * 底层是数组 根据传入的数据不同，创建不同长度的数组
 * 	语法：
 * 		修饰符 返回值类型 方法名（数据类型...变量名）{}
 * 方法中只能有一个可变参数，且必须在末尾
 */

public class args_learn {

	public static void main(String[] args) {
		System.out.println(add(7,3,4,6));
	}

	public static int add(int...arr) {
		int result=0;
		for (int i : arr) {
			result+=i;
		}
		return result;
	}
}
