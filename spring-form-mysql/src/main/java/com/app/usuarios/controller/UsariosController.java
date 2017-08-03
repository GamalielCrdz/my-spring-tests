package com.app.usuarios.controller;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.usuarios.entity.Usuarios;
import com.app.usuarios.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class UsariosController{
	
	@Autowired
	private UserServices userServices;
	
	@RequestMapping("/")
	public String indexC() {
		return "index";
	}
	
	@RequestMapping("/listaDeUsuarios")
	public String listUsers(Model model) {
		model.addAttribute("users", userServices.allUsers());
		return "list";
	}
		
    @RequestMapping(path="/add", method= RequestMethod.GET)
	public String addNewUser(Model model) {
		model.addAttribute("users", new Usuarios());
		return "form";
	}
	
	@RequestMapping(value="results", method= RequestMethod.GET )
	public String saveUser(Usuarios usuario) {
		userServices.saveUser(usuario);
        return "redirect:/listaDeUsuarios";
	}
    
	@RequestMapping(path="/listaDeUsuarios/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		userServices.deleteUser(id);
		return "redirect:/listaDeUsuarios";
	}
	
	@RequestMapping(path="/listaDeUsuarios/actualizar/{id}")
	public String updateUser(@PathVariable Integer id, Model model) {
		model.addAttribute("users", userServices.findById(id));
		return "form";
	}
}
