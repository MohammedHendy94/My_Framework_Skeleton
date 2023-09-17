package com.hendy.skeleton;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/com/hendy/skeleton/tests",
        glue = "com/hendy/skeleton/tests",
        tags="@reg",
        plugin = {"html:reports/FW-Skeleton.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
