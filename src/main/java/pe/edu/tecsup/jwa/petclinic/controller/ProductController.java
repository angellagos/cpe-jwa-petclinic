package pe.edu.tecsup.jwa.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/producto")
	String producto(Model model) {
		model.addAttribute("nombreProducto","Disco Duro 2TB");
		model.addAttribute("precioProducto",250.50);
		model.addAttribute("stockProducto",3);
		return "producto";
	}
}
