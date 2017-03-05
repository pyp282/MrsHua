package test.failures;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test.lister.DisableListener;
import test.lister.RegularListener;

@DisableListener
@Listeners(RegularListener.class)
public class ChildTest {



    @Test
    public void childTest() {
        System.out.println("testcase from ChildTest");
    }

    @Test
    public void test01() {
        System.out.println("test01 works from ChildTest");
    }

    public void testGuice() {
        System.out.println("Guice injection is working.................");
    }


}
