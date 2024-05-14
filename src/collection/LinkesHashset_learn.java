package collection;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * 底层是哈希表（数组+链表+红黑树）+链表（记录顺序，保证有序）
 * 保证输入输出顺序相同
 */

public class LinkesHashset_learn {

	public static void main(String[] args) {
			Set<Integer> s=new LinkedHashSet<Integer>();
			s.add(1);s.add(0);s.add(2);s.add(5);s.add(4);s.add(3);
			System.out.println(s);//输入输出顺序相同
	}
}
