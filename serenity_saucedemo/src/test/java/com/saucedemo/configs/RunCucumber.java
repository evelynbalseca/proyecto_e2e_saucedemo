package com.saucedemo.configs;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.saucedemo.definitions",
        tags = "@testCompraOK",
        publish = true

)
public final class RunCucumber {


    public RunCucumber ()
    {

    }

}