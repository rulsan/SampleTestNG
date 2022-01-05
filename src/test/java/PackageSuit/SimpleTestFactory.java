package PackageSuit;

import org.testng.annotations.Factory;

public class SimpleTestFactory {

    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new FirstTestClass(0), new FirstTestClass(1) };
    }
}
