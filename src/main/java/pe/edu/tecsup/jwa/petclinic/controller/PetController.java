package pe.edu.tecsup.jwa.petclinic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

	@GetMapping("welcome")
	String welcome() {
		return "Welcome to Tecsup";
	}
	
	/**
     * Crear el servicio de "petclinic"
     * que me envia el mensaje de "Welcome to Pet Store"
     */
	
	@GetMapping("petclinic")
	String petclinic() {
		return "Welcome to Pet Store";
	}
	
}
