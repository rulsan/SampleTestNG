package SecondPackageSuit;

import PackageSuit.TestClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest extends TestClass {

    @Parameters({ "suite-param" })
    @Test
    public void prameterTestOne(String param) {
        System.out.println("Test one suite param is: " + param);
    }

    @Parameters({ "test-two-param" })
    @Test
    public void prameterTestTwo(String param) {
        System.out.println("Test two param is: " + param);
    }

    @Parameters({ "suite-param", "test-three-param" })
    @Test
    public void prameterTestThree(String param, String paramTwo) {
        System.out.println("Test three suite param is: " + param);
        System.out.println("Test three param is: " + paramTwo);
    }

    // it can be run without any parameters
    @Parameters({ "optional-value" })
    @Test
    public void optionTest(@Optional("optional value") String value) {
        System.out.println("This is: " + value);
    }
}
