package co.com.bancodebogota.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Value("#{systemEnvironment['MY_EXTERNAL_ENDPOINT']}")
	private String enviromentVariable;
	
	@GetMapping("/getVariable")
	public String returnVariable() {
		return this.enviromentVariable;
	}

	@GetMapping("/getVariable2")
	public String returnVariable2() {
		return "Este si se ve";
	}
}
