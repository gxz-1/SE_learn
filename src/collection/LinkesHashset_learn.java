package collection;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * �ײ��ǹ�ϣ������+����+�������+������¼˳�򣬱�֤����
 * ��֤�������˳����ͬ
 */

public class LinkesHashset_learn {

	public static void main(String[] args) {
			Set<Integer> s=new LinkedHashSet<Integer>();
			s.add(1);s.add(0);s.add(2);s.add(5);s.add(4);s.add(3);
			System.out.println(s);//�������˳����ͬ
	}
}
