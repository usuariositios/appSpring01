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

import com.empresa.entity.Pais;
import com.empresa.service.PaisService;

@RestController //controlador rest
@RequestMapping("/rest/pais")
public class PaisController {
	@Autowired
	private PaisService paisService;
	
	@GetMapping
	@ResponseBody //formato json
	public ResponseEntity<List<Pais>> cargaPais(){
		List<Pais> lista = paisService.cargarPais();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Pais> guardarPais(@RequestBody Pais obj){
		Pais objSalida = paisService.guardarPais(obj);
		return ResponseEntity.ok(objSalida);
	}

}
