package pe.edu.tecsup.jwa.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

	@GetMapping("/message")
	String message(Model model) {
		model.addAttribute("msg","Message from Tecsup");
		return "message";
	}
}
