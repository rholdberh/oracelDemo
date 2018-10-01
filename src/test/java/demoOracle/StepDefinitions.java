package demoOracle;

import cucumber.api.Transpose;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import demo.oracle.ExcelUtils;
import demo.oracle.Pages.*;
import demo.oracle.TicketObject;

import java.util.List;

public class StepDefinitions {
    HomePage homePage;

    @Given("User open home page")
    public void openHomePage() throws Throwable {
        homePage = new HomePage();
    }

    @When("User register with username \"([^\"]*)\" and password \"([^\"]*)\"")
    public void registerUser(String user, String pass) {
        homePage = new HomePage();
        UserRegistrationPage userRegistrationPage = new UserRegistrationPage();
        homePage.pressRegister();
        userRegistrationPage.fillRegistrationForm(user, pass);
        userRegistrationPage.pressSubmit();
        userRegistrationPage.checkRegisteredPage();
    }

    @And("User log in with username \"([^\"]*)\" and password \"([^\"]*)\"")
    public void loginUser(String user, String pass){
        homePage.loginUser(user, pass);
    }

    @Given("a list of authors in a transposed table")
    public void aListOfAuthorsInATransposedTable(@Transpose List<TicketObject> authors) throws Throwable {
        System.out.println("b");
    }

    @When("User book ticket from file \"([^\"]*)\"")
    public void bookFlight( String file ){
        List<TicketObject> tickets = ExcelUtils.getTestObject(file);

        for (TicketObject ticket : tickets) {
            homePage.pressFlights();
            FlightFinderPage flightFinderPage = new FlightFinderPage();
            flightFinderPage.setDeparturesFrom(ticket.getDeparturesFrom());
            flightFinderPage.setDeparturesTime(ticket.getDeparturesMonth(),ticket.getDeparturesDate());
            flightFinderPage.setArrivingTo(ticket.getArrivingTo());
            flightFinderPage.setArrivingTime(ticket.getArrivingMonth(),ticket.getArrivingDate());
            flightFinderPage.pressContinue();

            new SelectFlightPage().pressContinue();

            BookFlightPage bookFlightPage = new BookFlightPage();
            bookFlightPage.setPassender(ticket.getUserFirstName(), ticket.getUserLastName());
            bookFlightPage.setCard(ticket.getCardType(),ticket.getCardNumber(),ticket.getCardExpMonth(),ticket.getCardExpYear());
            bookFlightPage.pressSecurePurchase();

            FlightConfirmationPage flightConfirmationPage = new FlightConfirmationPage();
            flightConfirmationPage.validateDeparturingDestinations();
        }
    }

    @After
    public void close(){
        homePage.close();
    }
}
