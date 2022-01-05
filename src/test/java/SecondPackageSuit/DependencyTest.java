package SecondPackageSuit;

import PackageSuit.TestClass;
import org.testng.annotations.Test;

public class DependencyTest extends TestClass {

    @Test(dependsOnMethods={"testTwo"})
    public void testOne(){
        System.out.println("Method one of Dependent Test");
    }

    @Test
    public void testTwo(){
        System.out.println("Method two of Independent Test");
    }

    @Test(dependsOnGroups={"test-group"})
    public void groupTestOne(){
        System.out.println("Method one of Group Dependent Test");
    }

    @Test(groups={"test-group"})
    public void groupTestTwo(){
        System.out.println("Group test method two");
    }

    @Test(groups={"test-group"})
    public void groupTestThree(){
        System.out.println("Group Test method three");
    }
}
