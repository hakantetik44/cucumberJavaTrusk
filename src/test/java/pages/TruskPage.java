package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TruskPage {


    public TruskPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath="//div[text()='Tout accepter']")
    public static WebElement googleCookies;


    @FindBy (xpath="//input[@title='Rechercher']")
    public static WebElement titleGoogle;

    @FindBy (xpath="//h3[text()='Trusk livre tout, tout de suite']")
    public static WebElement toutLivre;

    @FindBy (xpath="//div[text()='DEVENIR TRUSKER']")
    public static WebElement Devenir;

    @FindBy (css = "#__next > div > div > div > div > div > div > div > section > div > div > div.sc-AxjAm.sc-AxirZ.cgGKmQ > div.sc-AxjAm.sc-AxirZ.bMqMnm > div > div > button > div.sc-AxjAm.sc-AxirZ.PrimaryButton__InputContent-n3lcuo-1.gfBcOu > div.sc-AxjAm.cuWIvg.PrimaryButton__InputText-n3lcuo-2.djIHCU")
    public static WebElement verifyDevenirTrusker;


    @FindBy (xpath="//div[text()='TRUSK BUSINESS']")
    public static WebElement Business;

}
