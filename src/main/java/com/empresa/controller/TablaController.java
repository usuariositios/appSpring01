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

import com.empresa.entity.Tabla;
import com.empresa.service.TablaService;

@RestController //controlador rest
@RequestMapping("/rest/tabla")
public class TablaController {
	@Autowired
	private TablaService tablaService;
	
	
	@GetMapping
	@ResponseBody //formato json
	@RequestMapping("/cargarTabla")
	public ResponseEntity<List<Tabla>> cargarTabla(){
		List<Tabla> lista = tablaService.cargarTabla();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	@RequestMapping("/guardarTabla")
	public ResponseEntity<Tabla> guardarTabla(@RequestBody Tabla t){
		Tabla objSalida = tablaService.guardarTabla(t);
		return ResponseEntity.ok(objSalida);
	}
	
	@PostMapping
	@ResponseBody //formato json
	@RequestMapping("/buscarTabla")
	public ResponseEntity<List<Tabla>> buscarTabla(@RequestBody Tabla t){
		List<Tabla> lista = tablaService.buscarTabla(t);
		return ResponseEntity.ok(lista);
	}
}
