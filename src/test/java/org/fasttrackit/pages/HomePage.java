package org.fasttrackit.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountButton;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;
    @FindBy (id="search")
    private WebElementFacade searchField;
    @FindBy(css=".search-button")
    private WebElementFacade searchButton;

    public void clickOnAccountButton(){
        clickOn(accountButton);
    }

    public void clickOnLoginLink(){
        clickOn(loginLink);
    }
    public void setSearchField(String value){typeInto(searchField,value);}
    public void clickSearchButton(){clickOn(searchButton);}





}

