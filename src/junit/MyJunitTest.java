package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyJunitTest {

    @Before
    public void prepare(){
        System.out.println(" before ??????????????????????????????");
    }

    @After
    public void destroy(){
        System.out.println(" destroy ????????????????????????????");
    }

    @Test
    public void testAdd(){
        System.out.println(" test ??testadd() ");
    }

    @Test
    public void testUpdate(){
        System.out.println(" test ??testUpdate() ");
    }
}