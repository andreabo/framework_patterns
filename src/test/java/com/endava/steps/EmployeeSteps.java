package com.endava.steps;

import com.endava.patterns.entities.Employee;
import com.endava.patterns.mapper.EmployeeMapper;
import com.endava.patterns.utils.HttpRequest;
import com.endava.patterns.utils.Session;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.endava.patterns.utils.Strings.BASE_URI;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class EmployeeSteps {
    private final String employeeUri = BASE_URI + "/employee";
    private Session session = new Session();

    @Given("^There are employees$")
    public void thereAreEmployees() {
    }

    @When("^I request for all employees$")
    public void iRequestForAllEmployees() {
        Object employees = new HttpRequest().getFromUri(employeeUri);
        session.addToMap("employees", employees);
    }

    @Then("^I should get all employees data$")
    public void iShouldGetAllEmployeesData() {
        Object employeesObject = session.getFromMap("employees");
        Employee[] employees = new EmployeeMapper().mapObjectToEmployees(employeesObject);
        assertThat(employees.length, greaterThanOrEqualTo(1));
    }
}
