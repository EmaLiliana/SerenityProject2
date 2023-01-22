package org.fasttrackit.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class CartPage extends BasePage {
    @FindBy(css = ".success-msg span")
    private WebElementFacade successMsgAddToCart;


    @FindBy(css = ".product-cart-price .cart-price span")
    private WebElementFacade productPrice;
    @FindBy(css = "[title='Qty']")
    private WebElementFacade qty;
    @FindBy(css = ".product-cart-total .price")
    private WebElementFacade subtotal;
    @FindBy(css = "tbody > tr:nth-child(2) > td span")
    private WebElementFacade tax;
    @FindBy(css = "tfoot td:nth-child(2) > strong > span")
    private WebElementFacade grandTotal;

    public void verifySuccessMsgAddToCart() {
        String productName = "Slim fit Dobby Oxford Shirt ";
        successMsgAddToCart.getText().equalsIgnoreCase(productName + " was added to your shopping cart.");
    }

    public boolean verifyCartTotal() {
        if (productPrice.getValue() == subtotal.getValue()) {
            return true;
        }

        return false;
    }
}












