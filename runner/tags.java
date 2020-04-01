package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(features="F:\\Hari\\cucumber\\features\\tags.feature",
glue="Cucumber_wfh",
tags= {"@searchprdcts","not @regression"},
monochrome=true,
plugin= {"pretty","html:target/cucumber-html-report"})


public class tags {

}
