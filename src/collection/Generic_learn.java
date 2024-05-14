package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_learn {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();// 对象不使用泛型，默认为Object
		list.add(666);
		list.add("111");// 可储存任意类型

		Iterator it = list.iterator();// 对象不用泛型，迭代器也不用
		while (it.hasNext()) {
			Object object = it.next();// 取出的元素默认为Object类型
			System.out.println(object);
		}
		
		//自定义泛型类
		myGeneric<Integer> gc=new myGeneric<>();
		gc.setName(2333);
		System.out.println(gc.getName());
		
		//自定义泛型方法
		Generic_learn.myGenericmethod(123);
		Generic_learn.myGenericmethod('h');//传什么类型就是什么类型
	}
	
	//自定义泛型方法
	public static<M> void myGenericmethod(M m) {
		// TODO Auto-generated method stub
		System.out.println(m);
	}
	

}

//自定义泛型
class myGeneric<E>{
	private E name;

	/**
	 * @return the name
	 */
	public E getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(E name) {
		this.name = name;
	}
	
}