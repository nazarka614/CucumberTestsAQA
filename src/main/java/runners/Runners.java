package runners;

import configuretions.BROWSERS;
import configuretions.BaseClass;
import configuretions.DriverConfig;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/feature",//path to feature files
        glue = "steps",//package path
        tags = "@Footboll",//list feature files for run
        dryRun = false,
        monochrome = true,
        publish = true)


public class Runners {


    @BeforeClass
    public static void createDriver() {
        System.setProperty("CUCUMBER_PUBLISH_TOKEN", "ec68f5d4-33b5-43f0-a6fc-f9a31456a208");
        BaseClass.driver = DriverConfig.create(BROWSERS.CHROMEINCOGNITO);

    }

    @AfterClass
    public static void after() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BaseClass.driver.quit();
    }

}
