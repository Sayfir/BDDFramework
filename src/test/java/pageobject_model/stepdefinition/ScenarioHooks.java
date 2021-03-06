package pageobject_model.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageobject_model.page.CloudGoogleContactPage;
import pageobject_model.page.DriverContainer;

public class ScenarioHooks extends DriverContainer {

    @Before
    public void setUp() {
        new CloudGoogleContactPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}
