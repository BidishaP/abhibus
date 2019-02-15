package org.greens.Cucumber6;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber6\\Feature\\addcust50.feature",glue= {"org.greens"}, plugin= {"html:target"}, monochrome=true)

public class TestRunner {

}
