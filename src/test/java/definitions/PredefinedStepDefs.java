package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static support.TestContext.getDriver;

public class PredefinedStepDefs {
    @Given("I open url {string}")
    public void iOpenUrl(String url) {
        getDriver().get(url);
    }

    @And("I wait for {int} sec")
    public void iWaitForSec(int sec) throws Exception {
        Thread.sleep(sec * 1000);

    }
}
