package stepDefiniton;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;
//import org.testng.annotations.Test;

public class GetAPICall {



    @Given("^GetAPICALL$")
    public void get_apicall(DataTable dataTable) {

        System.out.println("First Cucumber Test");
        List<List<String>> data = dataTable.asLists(String.class);

        System.out.println(  data.get(0).get(0));
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("PostAPICALL")
    public void Post_apicall() {

        System.out.println("Second Cucumber Test");
        // Write code here that turns the phrase above into concrete actions
    }

}
