package CucumberFrame;

import io.cucumber.java.en.Given;

public class Steps {

    @Given("Create a pet with following fields")
    public void createPet() {
        System.out.println("New pet was created");
    }
}
