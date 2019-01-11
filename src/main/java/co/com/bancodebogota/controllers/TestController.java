package co.com.bancodebogota.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private String enviromentVariable;
	
	@GetMapping("/getVariable")
	public String returnVariable() {
		this.enviromentVariable = "valor nuevo";
		return this.enviromentVariable;
		
	}

}
