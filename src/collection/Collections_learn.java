package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * 在Collections(不是Collection)中封装了许多静态方法
 * 如 shuffle()打乱顺序 
 * 	  addall(list,args)往list中添加任意元素
 * 	  sort()排序
 */
public class Collections_learn {
	public static void main(String[] args) {
		ArrayList<String> c = new ArrayList<>();
		Collections.addAll(c, "嘿", "啦啦啦");// 往c中添加多个元素
		Collections.shuffle(c);
		Collections.sort(c);

		ArrayList<animal> aaa = new ArrayList<animal>();
		animal a1 = new animal("猫", 1);
		animal a2 = new animal("狗", 3);
		animal a3 = new animal("鸭", 2);
		Collections.addAll(aaa, a1, a2, a3);//
		Collections.sort(aaa);//按年龄排序
	}

}

//对自定义类型排序，须实现Comparable接口，重写compareTo方法
class animal implements Comparable<animal> {
	private String name;
	private int age;

	@Override
	public int compareTo(animal o) {
		// TODO Auto-generated method stub
		return age - o.age;// 升序
	}

	public animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}