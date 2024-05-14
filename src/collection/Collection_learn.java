package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * 
 * 							    ---Vector
 * 				---list(接口)------Linklist   有序、有索引、可重复、遍历
 * 								---Arraylist
 * collection---				
 *	                            ---TreeSet
 *			    ---set(接口)----   							不能重复，没有索引，不能遍历
 *								---HashSet---LinkedHashSet
 *
 */

/*
 * Collection的方法
 * 	public boolean add（E e）：把给定的对象添加到当前集合中。
	public void clear（）：清空集合中所有的元素。
	public boolean remove（E e）：把给定的对象在当前集合中删除。
	public boolean contains（E e）：判断当前集合中是否包含给定的对象。
	public boolean isEmpty（）：判断当前集合是否为空。
	public int size（）：返回集合中元素的个数。
	public object[]toArray（）：把集合中的元素，存储到数组中。
 * 
 */
public class Collection_learn{
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<>();
		c.add("hello");
		c.add("world");
		System.out.println(c);//输出内容，说明重写了tostring()
		c.remove("hello");
		c.contains("hello");
		Object[] arr=c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}