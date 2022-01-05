package PackageSuit;

import org.testng.annotations.Test;

public class SecondTestClass extends TestClass {

    @Test
    public void firstTestOfSecondSuit(){
        System.out.println("First TestNG test of Second Class");
    }

    @Test
    public void secondTestOfSecondSuit(){
        System.out.println("Second TestNG test of Second Class");
    }

    @Test
    public void thirdTestOfSecondSuit(){
        System.out.println("Third TestNG test of Second Class");
    }

    @Test(dataProvider = "data-provider",dataProviderClass=SecondPackageSuit.DataProviderClass.class)
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}
