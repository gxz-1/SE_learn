package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * java.util.Iterator接口：迭代器（对集合进行遍历）
	有两个常用的方法
	boolean hasNext（）如果仍有元素可以迭代，则返回true。
	false E next（）返回迭代的下一个元素。
	collection接口中有-一个方法，叫iterator（），
	这个方法返回的就是迭代器的实现类对象Iterator<E> iterator（）返回在此collection 的元素上进行迭代的迭代器。
 * 
 */

public class iterator_learn {

	public static void main(String[] args) {
		//创建集合
		Collection<String> c=new ArrayList<>();
		c.add("aa");
		c.add("bb");
		c.add("cc");
		//创建迭代器
		Iterator<String> it=c.iterator();
		//迭代遍历
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		//用增强for循环
		for (String string : c) {
			System.out.println(string);
		}
		
	}




}
