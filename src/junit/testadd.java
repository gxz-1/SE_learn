package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testadd {
	
	//用于资源的申请，所有测试方法执行之前执行
	@Before
	public void init() {
		System.out.println("init被执行了");
	}
	
	//所有测试方法执行完后自动执行该方法，抛出异常仍执行
	@After
	public void close() {
		System.out.println("close被执行了");
	}
	
	@Test
	public void Testadd(){
		System.out.println("这是第一个测试");
		//创建待测试对象
		add a = new add();		
		//断言 
		int result=a.func(2, 1);
		assertEquals(3, result);//断言,若测试值与期望值相同继续，不相同抛出异常
	}
	
	@Test
	public void Testadd2() {
		System.out.println("这是第二个测试方法，在它前后init和close也和被执行");
	}
}
