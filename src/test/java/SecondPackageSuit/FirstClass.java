package SecondPackageSuit;

import org.testng.annotations.Test;

public class FirstClass {

    @Test(groups = {"smoke"})
    public void firstTestMethod(){
        System.out.println("First test method of First Class of Second Package Suit SMOKE");
    }

    @Test
    public void secondTestMethod(){
        System.out.println("Second test of First Class of Second Package Suit");
    }

    @Test
    public void thirdTestMethod(){
        System.out.println("Third test of First Class of Second Package Suit");
    }
}
