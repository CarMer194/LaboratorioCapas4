package com.uca.capas.laboratorio4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.laboratorio4.domain.Producto;
import com.uca.capas.laboratorio4.domain.Robot;

@Controller
public class MainController {
	
	@RequestMapping("/producto")
	public ModelAndView initMain() {
		Producto producto=new Producto();
		ModelAndView model = new ModelAndView();
		model.addObject("producto",producto);
		model.setViewName("index");
		
		return model;
	}
	
	@RequestMapping("/formProducto")
	public ModelAndView formProducto(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView model = new ModelAndView();
		if(result.hasErrors()) {
			model.setViewName("index");
		}else {
			Robot robot = new Robot();
			model.addObject("robot",robot);
			model.setViewName("robot");
		}
		return model;
	}
	
	@RequestMapping("/seguridad")
	public ModelAndView formSeguridad(@Valid @ModelAttribute Robot robot, BindingResult result) {
		ModelAndView model=new ModelAndView();
		if(result.hasErrors()) {
			model.setViewName("robot");
		}else {
			model.setViewName("exito");
		}
		
		return model;
	}

}
