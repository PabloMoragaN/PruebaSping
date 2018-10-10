package Equipo02.PruebaSpring;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class PruebasCucumber {
	private String resultado;
	
	@When("^usando la funcion print$")
	public void usando_la_funcion_print() throws Throwable {
	    System.out.println("");
	}
	@Then("^el resultado es Hola Mundo$")
	public void el_resultado_es_Hola_Mundo() throws Throwable {
	    resultado = "Hola Mundo";
	    System.out.println(resultado);
	}
}
