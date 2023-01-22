package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void verifyProductPageIsCorrect(){
        cartPage.verifySuccessMsgAddToCart();

    }
    @Step
    public void verifySubtotal() {

        Assert.assertTrue("The prices do not match.",cartPage.verifyCartTotal());
    }




}






