package com.eric.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	@Given("a user is on the View Todos page")
	public void a_user_is_on_the_view_todos_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.err.println("Given :::: a user is on the View Todos page ");
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the user is logged in as a basic user")
	public void the_user_is_logged_in_as_a_basic_user() {
	    // Write code here that turns the phrase above into concrete actions
		System.err.println("Given :::: the user is logged in as a basic user ");
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("the user has at least one completed todo in their list of todos")
	public void the_user_has_at_least_one_completed_todo_in_their_list_of_todos() {
	    // Write code here that turns the phrase above into concrete actions
		System.err.println("Given :::: the user has at least one completed todo in their list of todos ");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("the user hits the CHECK TODOS button")
	public void the_user_hits_the_check_todos_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.err.println("GWhen :::: the user hits the CHECK TODOS button ");
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("the completed todos will be marked as complete on the page")
	public void the_completed_todos_will_be_marked_as_complete_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.err.println("Then :::: the completed todos will be marked as complete on the page ");
	    //throw new io.cucumber.java.PendingException();
	}	    
	
	//This is for Fourth.feature
	@Given("the user does not have a completed todo in their list of todos")
    public void the_user_does_not_have_a_completed_todo_in_their_list_of_todos() {
        // Write code here that turns the phrase above into concrete actions
      System.err.println("Given :::: the user does not have a completed todo in their list of todos");
    }

    @Then("none of the incomplete todos will be marked as complete on the page")
    public void none_of_the_incomplete_todos_will_be_marked_as_complete_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
       System.err.println("Then :::: none of the incomplete todos will be marked as complete on the page");
    }

    @Given("the user has {int} completed todos and {int} incomplete todos in their list of todos")
    public void the_user_has_completed_todos_and_incomplete_todos_in_their_list_of_todos(Integer complete, Integer incomplete) {
        // Write code here that turns the phrase above into concrete actions
    System.err.println("Given :::: the user has {"+complete+"} completed todos and {"+incomplete+"} incomplete todos in their list of todos");    
    }

    @Then("{int} of the todos will be marked as complete on the page")
    public void of_the_todos_will_be_marked_as_complete_on_the_page(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.err.println("Then ::: "+int1 +"of the todos will be marked as complete on the page");
    }
    
    @Then("there should be a total of {int} todos listed on the page")
    public void there_should_be_a_total_of_todos_listed_on_the_page(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    	System.err.println("Then :::: there should be a total of {"+int1+"} todos listed on the page");

}
}//this ends class
