package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void validLoginTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        loginSteps.userIsLoggedIn(Constants.USER_NAME);

    }
}
