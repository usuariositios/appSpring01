package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Personal;
import com.empresa.service.PersonalService;

@RestController //controlador rest
@RequestMapping("/rest/personal")
public class PersonalController {
	@Autowired
	private PersonalService personalService;
	
	@GetMapping
	@ResponseBody //formato json
	@RequestMapping("/cargaPersonal1")
	public ResponseEntity<List<Personal>> cargaPersonal(){
		List<Personal> lista = personalService.cargarPersonal();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	@RequestMapping("/guardarPersonal")
	public ResponseEntity<Personal> guardarPersonal(@RequestBody Personal p){
		Personal objSalida = personalService.guardarPersonal(p);
		return ResponseEntity.ok(objSalida);
	}
	
	@PostMapping
	@ResponseBody //formato json
	@RequestMapping("/cargaPersonal")
	public ResponseEntity<List<Personal>> cargaPersonal(@RequestBody Personal p){
		List<Personal> lista = personalService.cargarPersonal(p);
		return ResponseEntity.ok(lista);
	}	
	

}
