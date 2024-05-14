package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * 
 * 							    ---Vector
 * 				---list(�ӿ�)------Linklist   ���������������ظ�������
 * 								---Arraylist
 * collection---				
 *	                            ---TreeSet
 *			    ---set(�ӿ�)----   							�����ظ���û�����������ܱ���
 *								---HashSet---LinkedHashSet
 *
 */

/*
 * Collection�ķ���
 * 	public boolean add��E e�����Ѹ����Ķ�����ӵ���ǰ�����С�
	public void clear��������ռ��������е�Ԫ�ء�
	public boolean remove��E e�����Ѹ����Ķ����ڵ�ǰ������ɾ����
	public boolean contains��E e�����жϵ�ǰ�������Ƿ���������Ķ���
	public boolean isEmpty�������жϵ�ǰ�����Ƿ�Ϊ�ա�
	public int size���������ؼ�����Ԫ�صĸ�����
	public object[]toArray�������Ѽ����е�Ԫ�أ��洢�������С�
 * 
 */
public class Collection_learn{
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<>();
		c.add("hello");
		c.add("world");
		System.out.println(c);//������ݣ�˵����д��tostring()
		c.remove("hello");
		c.contains("hello");
		Object[] arr=c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}