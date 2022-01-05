package SecondPackageSuit;

import PackageSuit.TestClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass extends TestClass {

    @DataProvider(name="data-provider")
    public static Object[][] dataProviderMethod(){
        return new Object[][] { { "data one" }, { "data two" } };
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}
