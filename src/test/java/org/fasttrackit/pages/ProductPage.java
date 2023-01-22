package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    @FindBy(css="li.nav-5 a")
    private WebElementFacade saleButton;
    @FindBy(css=".actions a")
    private WebElementFacade selectItem;
    @FindBy(css=".swatch-label img")
    private WebElementFacade selectColor;
    @FindBy(css="#configurable_swatch_size span")
    private WebElementFacade selectSizeItem;
    @FindBy(css=".add-to-cart-buttons span span")
    private WebElementFacade addToCartButton;
    @FindBy(css=".product-name [title='Slim fit Dobby Oxford Shirt']")
    private WebElementFacade productName;

    public void clickSaleButton(){
        clickOn(saleButton);
    }
    public void clickSelectItem(){
        clickOn(selectItem);
    }
    public void clickSelectColor(){
        clickOn(selectColor);
    }
    public void clickSelectSizeItem(){
        clickOn(selectSizeItem);
    }
    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }


    }


