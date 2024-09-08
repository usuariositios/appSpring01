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

import com.empresa.entity.EstadosRegistro;
import com.empresa.service.EstadosRegistroService;


@RestController //controlador rest
@RequestMapping("/rest/estadosRegistro")
public class EstadosRegistroController {
	@Autowired
	private EstadosRegistroService estadosRegistroService;
	@GetMapping
	@ResponseBody //formato json
	public ResponseEntity<List<EstadosRegistro>> cargaEstadosRegistro(){
		List<EstadosRegistro> lista = estadosRegistroService.cargarEstadosRegistro();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<EstadosRegistro> insertaEstadosRegistro(@RequestBody EstadosRegistro obj){
		EstadosRegistro objSalida = estadosRegistroService.guardarEstadosRegistro(obj);
		return ResponseEntity.ok(objSalida);
	}
	
}