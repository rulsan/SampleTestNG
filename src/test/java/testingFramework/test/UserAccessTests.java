package testingFramework.test;

import org.testng.annotations.Test;
import testingFramework.page.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class UserAccessTests extends CommonConditions{
    @Test
    public void oneCanLoginGithub(){
        String loggedInUserName = new LoginPage(driver)
                .openPage()
                .login(USER_NAME, USER_PASSWORD)
                .getLoggedInUserName();
        assertThat(loggedInUserName, is(equalTo(USER_NAME)));
    }
}
