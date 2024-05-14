package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map<key,value> ��key�������ظ� value���ԣ�
 * Map�еĳ��÷���
 * v put(k,v) ��k���ڣ�����v�滻��ǰ��v������֮ǰ��v���أ����򷵻ؿ�
 * v romove(k)��k���ڣ�����ɾ��ֵ�����򷵻ؿ�
 * v get(k)   ��k���ڣ�����v
 * boolean containsKey(k) �ж�k�Ƿ����
 * 
 * Set<k> keyset()����k��ɵ�set����
 * Set<Map.Entry<k,v>> entryset()����Entry��ɵļ��� Entry�а���getkey(),getvalue()����
 * 
 * ��HashSet�д洢�Զ���������Ϊkeyֵ,��Ҫ��дhashcode��tostring()����
 * 
 * LinkedHashMapͬ�� ����������֤˳��
 */
public class Map_learn {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();//HashMap����ʵ����Map�ӿڣ��ײ��ǹ�ϣ��
		m.put("����", 18);
		System.out.println(m.put("����", 20));
		System.out.println(m.remove("����"));
		
		m.put("����", 22);
		m.put("����", 25);
		Set<Map.Entry<String, Integer>> s=m.entrySet();
		//����
		Iterator<Map.Entry<String, Integer>> it=s.iterator();
		while (it.hasNext()) {
			Map.Entry<String,Integer> entry = it.next();
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
		}
		//��ǿfor����
//		for (Entry<String, Integer> entry : s) {
//			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
//		}
	}

}
