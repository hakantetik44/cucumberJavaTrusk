package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.TruskPage;
import utilities.ConfigReader;
import utilities.Driver;



import static org.openqa.selenium.Keys.ENTER;

public class TruskStepDefinitions {

    TruskPage truskPage=new TruskPage();

    @Given("Aller dans la page de Google")
    public void allerDansLaPageDeGoogle() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        TruskPage.googleCookies.click();


    }


    @When("Chercher le mot clé {string}")
    public void chercherLeMotClé(String Trusk) {

        TruskPage.titleGoogle.sendKeys(Trusk +ENTER);

    }

    @Then("Vérifier que le premier résultat de recherche est {string}")
    public void vérifierQueLePremierRésultatDeRechercheEst(String ToutLivre) throws InterruptedException {

        Assert.assertTrue(TruskPage.toutLivre.getText().contains(ToutLivre));
        Thread.sleep(2000);


    }

    @And("Cliquer dessus")
    public void cliquerDessus() {

        TruskPage.toutLivre.click();
    }

    @And("Vérifier que le résultat est bien {string}")
    public void vérifierQueLeRésultatEstBien(String url) {


      Assert.assertEquals(url, Driver.getDriver().getCurrentUrl());

    }

    @Given("Aller la page de Trusk")
    public void allerLaPageDeTrusk() {

        Driver.getDriver().get(ConfigReader.getProperty("truskUrl"));
    }

    @When("Cliquer desus le DEVENIR TRUSKER")
    public void cliquerDesusLeDEVENIRTRUSKER() {
        TruskPage.Devenir.click();
    }




    @Then("Verifier le lien et la page {string}")
    public void verifierLeLienEtLaPage(String url2) {
        TruskPage.verifyDevenirTrusker.isDisplayed();


    }

    @And("Retour à la page Trusk")
    public void retourÀLaPageTrusk() {
    Driver.getDriver().navigate().back();

    }
    @And("Cliquer sur le TRUSK BUSINESS")
    public void cliquerSurLeTRUSKBUSINESS() {

        TruskPage.Business.click();
    }


    @And("Vérifier le lien et la page {string}")
    public void vérifierLeLienEtLaPage(String urlBusinnes) throws InterruptedException {

           Thread.sleep(2000);
        Assert.assertEquals(urlBusinnes, Driver.getDriver().getCurrentUrl());


    }



}
