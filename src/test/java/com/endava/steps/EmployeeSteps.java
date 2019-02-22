package com.endava.steps;

import com.endava.patterns.entities.employee.Employee;
import com.endava.patterns.entities.factory.EmployeeFactory;
import com.endava.patterns.mapper.EmployeeMapper;
import com.endava.patterns.utils.HttpRequest;
import com.endava.patterns.utils.Session;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Arrays;
import java.util.Optional;

import static com.endava.patterns.utils.Constants.AUTOMATION_SUBDISCIPLINE;
import static com.endava.patterns.utils.Constants.BASE_URI;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

public class EmployeeSteps {
    private final String employeeUri = BASE_URI + "/employee";

    @Given("^There are employees$")
    public void thereAreEmployees() {
    }

    @Given("^There is an \"([^\"]*)\"$")
    public void thereIsAn(String subDiscipline) {
        Employee employee = EmployeeFactory.getEmployee(subDiscipline);
        HttpRequest.getInstance().postFromUri(employeeUri, employee);
    }

    @When("^I request for all employees$")
    public void iRequestForAllEmployees() {
        Object employees = HttpRequest.getInstance().getFromUri(employeeUri);
        Session.getInstance().addToMap("employees", employees);
    }

    @Then("^I should get all employees data$")
    public void iShouldGetAllEmployeesData() {
        Object employeesObject = Session.getInstance().getFromMap("employees");
        Employee[] employees = EmployeeMapper.getInstance().mapObjectToEmployees(employeesObject);
        assertThat(employees.length, greaterThanOrEqualTo(1));
    }

    @Then("^I should get a tester employee$")
    public void iShouldGetATesterEmployee() {
        Optional optional;
        Object employeesObject = Session.getInstance().getFromMap("employees");
        Employee[] employees = EmployeeMapper.getInstance().mapObjectToEmployees(employeesObject);
        optional = Arrays.stream(employees)
                .filter(item -> item.getSubDiscipline() == AUTOMATION_SUBDISCIPLINE)
                .findFirst();
        assertThat(optional.isPresent(), is(true));
    }
}
