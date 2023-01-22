package org.fasttrackit.features;

import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void cartTest(){
        addToCartSteps.addItemToCart();
        cartSteps.verifyProductPageIsCorrect();
    }
    @Test
    public void verifyCartSubtotalTest(){
        addToCartSteps.addItemToCart();
        cartSteps.verifySubtotal();



    }

}
