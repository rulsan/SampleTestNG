package SecondPackageSuit;

import PackageSuit.TestClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class FirstClass extends TestClass {

    @Test(groups = {"smoke"})
    public void firstTestMethod(){
        System.out.println("First test method of First Class of Second Package Suit SMOKE");
    }

    @Test
    public void secondTestMethod(){
        long id = Thread.currentThread().getId();
        System.out.println("Second test of First Class of Second Package Suit");
        System.out.println("Thread id is: "+id);
    }

    @Test
    public void thirdTestMethod(){
        long id = Thread.currentThread().getId();
        System.out.println("Third test of First Class of Second Package Suit");
        System.out.println("Thread id is: "+id);
    }

    //Disabling a test
    @Test(enabled=false)
    public void testDisabledMethod(){
        System.out.println("Disabled test");
    }

    @Test(expectedExceptions={IOException.class})
    public void testWithExpectedException(){
        System.out.println("Test with expected exception");
        // test failed
    }

    @Test(expectedExceptions={IOException.class},   expectedExceptionsMessageRegExp="Pass Message test")
    public void testWithExpectedMessageException() throws Exception {
        System.out.println("Test with expected message exception");
        throw new IOException("Pass Message test");
        // test passed
    }

    @Test(timeOut=500)
    public void timeTestOne() throws InterruptedException{
        System.out.println("Time test method one");
        sleep(1000);
    }
}
