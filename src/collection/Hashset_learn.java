package collection;

import java.util.HashSet;
import java.util.Set;
/*
 * Hashset
 * 不能重复，无序，输入输出顺序可能不一样
 * 底层哈希表实现
 */

public class Hashset_learn {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(6);
		s.add(3);
		s.add(4);
		//输入输出不一样
		for (Integer integer : s) {
			System.out.println(integer);
		}

		// Object类中 int hashcode()返回对象的哈希值，返回对象的虚拟地址
		// 在tostring()方法中返回值就是"对象名@哈希值"
		// String实际重写了hashcode()方法
		// Hashset调用hashcode()根据哈希值存储在数组中，调用equal()判断，若出现哈希冲突时小于8个用链表，否则用红黑树。

		// 储存自定义类型
		HashSet<people> h = new HashSet<people>();

		people p1 = new people(18, "小王");
		people p2 = new people(18, "小王");
		people p3 = new people(20, "小王");
		
		System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
		System.out.println("p1.equals(p2)="+p1.equals(p2));
		System.out.println("p2.equals(p3)="+p2.equals(p3));
		//重写使p1,p2的hashcode返回值相同，toequal()判定相同，从而p2不储存
		h.add(p1);
		h.add(p2);
		h.add(p3);
		//重写了tostring方法
		System.out.println(h);
	}

}

// 储存自定义类型元素 须重写tostring(),hashcode()
class people {
	private int age;
	private String name;

	public people(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		people other = (people) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "people [age=" + age + ", name=" + name + "]";
	}

}
