package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class AddToCartSteps extends BaseSteps{
    @Step
    public void clickOnSale() {productPage.clickSaleButton();
    }

    @Step
    public void clickOnItem() {
        productPage.clickSelectItem();
    }

    @Step
    public void clickOnColor() {

        productPage.clickSelectColor();
    }

    @Step
    public void clickOnSize() {
        productPage.clickSelectSizeItem();
    }

    @Step
    public void clickOnAddToCart() {
        productPage.clickAddToCartButton();
    }


    @Step
    public void addItemToCart() {
        clickOnSale();
        clickOnItem();
        clickOnColor();
        clickOnSize();
        clickOnAddToCart();
    }



}
