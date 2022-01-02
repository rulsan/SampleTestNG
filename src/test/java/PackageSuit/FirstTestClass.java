package PackageSuit;

import org.testng.annotations.Test;

public class FirstTestClass {

    @Test
    public void firstTestMethod(){
        System.out.println("First TestNG test");
    }

    @Test
    public void secondTestMethod(){
        System.out.println("Second TestNG test");
    }

    @Test(groups = {"smoke"})
    public void thirdTestMethod(){
        System.out.println("Third TestNG test SMOKE");
    }
}
