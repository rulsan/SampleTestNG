package PackageSuit;

import org.testng.annotations.*;

// It is used by SimpleTestFactory
public class FirstTestClass extends TestClass{
    private int param;

    public FirstTestClass() {
        this.param = 0;
    }

    public FirstTestClass(int param) {
        this.param = param;
    }

    @Test
    public void firstTestMethod(){
        int opValue = param + 1;
        System.out.println("First TestNG test output: " + opValue);
    }

    @Test
    public void secondTestMethod(){
        int opValue = param + 2;
        System.out.println("Second TestNG test output: " + opValue);
    }

    @Test(groups = {"smoke"})
    public void thirdTestMethod(){
        System.out.println("Third TestNG test SMOKE");
    }
}
