package BDDrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/workspace1/BDD/src/main/java/BDDFeatures"
,glue={"BDDSteps"},tags={"@Seleniumtest"},
plugin={"pretty","html:target/cucmber.json","junit:target/cukes.xml"},
monochrome=true)
public class bddrunner {

}
