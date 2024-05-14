package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map<key,value> （key不允许重复 value可以）
 * Map中的常用方法
 * v put(k,v) 若k存在，则用v替换以前的v，并将之前的v返回，否则返回空
 * v romove(k)若k存在，返回删除值，否则返回空
 * v get(k)   若k存在，返回v
 * boolean containsKey(k) 判定k是否存在
 * 
 * Set<k> keyset()返回k组成的set集合
 * Set<Map.Entry<k,v>> entryset()返回Entry组成的集合 Entry中包含getkey(),getvalue()方法
 * 
 * 在HashSet中存储自定义类型作为key值,需要重写hashcode和tostring()方法
 * 
 * LinkedHashMap同理 加上链表，保证顺序
 */
public class Map_learn {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();//HashMap集合实现了Map接口，底层是哈希表
		m.put("张三", 18);
		System.out.println(m.put("张三", 20));
		System.out.println(m.remove("张三"));
		
		m.put("李四", 22);
		m.put("王五", 25);
		Set<Map.Entry<String, Integer>> s=m.entrySet();
		//遍历
		Iterator<Map.Entry<String, Integer>> it=s.iterator();
		while (it.hasNext()) {
			Map.Entry<String,Integer> entry = it.next();
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
		}
		//增强for遍历
//		for (Entry<String, Integer> entry : s) {
//			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
//		}
	}

}
