package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import pageObjects.CellPhonePage;
import pageObjects.CellPhonesPage;
import pageObjects.MainPage;
import tools.InputData;
import tools.Tools;

import static tools.InputData.CELLPHONENAME;

public class CellPhonesSteps {

    CellPhonesPage cellPhonesPage;

    @Before()
    public void setup(){
        cellPhonesPage = new CellPhonesPage();
    }

    @When("^he adds “HTC One Mini Blue” to his shopping cart$")
    public void displayElectronicsCellPhones(){
        CellPhonePage htcOneMiniBlue = cellPhonesPage.getCellPhone(CELLPHONENAME);
        htcOneMiniBlue.addCellPhoneToTheCart();
    }
}
