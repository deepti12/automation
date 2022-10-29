package api.cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHokks {
    @Before
    public void setUp()
    {
        System.out.println("before hooks");
    }
    @After
    public void tearDown()
    {

    }
}
