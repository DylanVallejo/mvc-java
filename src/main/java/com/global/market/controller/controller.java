package com.global.market.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller //enviar los datos a una vista 

public class controller {
	
	
		
		@GetMapping("/") //mapeo de la ruta con el servicio
		//asignando una solicitud a un metodo del controlador
		public String getForm(Model model) {  
			model.addAttribute("categories", Constants.CATEGORIES);
//			
			return "form"; //referenciado al archivo html 	
		}
//		private final String getForm(Model model) {  
//			model.addAttribute("categories", Constants.CATEGORIES);
//			return "form"; //referenciado al archivo html 	
//		}
		
		
		@GetMapping("/inventory") //mapeo de la ruta con el servicio 
		public String getInventory() {
			return "inventory"; 			
		}
	}

