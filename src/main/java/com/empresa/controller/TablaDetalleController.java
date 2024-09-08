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

import com.empresa.entity.TablaDetalle;
import com.empresa.service.TablaDetalleService;



@RestController //controlador rest
@RequestMapping("/rest/tablaDetalle")
public class TablaDetalleController {
	@Autowired
	private TablaDetalleService tablaDetalleService;
	
	
	@GetMapping
	@ResponseBody //formato json
	@RequestMapping("/cargarTablaDetalle")
	public ResponseEntity<List<TablaDetalle>> cargarTablaDetalle(){
		List<TablaDetalle> lista = tablaDetalleService.cargarTablaDetalle();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	@RequestMapping("/guardarTablaDetalle")
	public ResponseEntity<TablaDetalle> guardarTablaDetalle(@RequestBody TablaDetalle td){
		TablaDetalle objSalida = tablaDetalleService.guardarTablaDetalle(td);
		return ResponseEntity.ok(objSalida);
	}
	
	@PostMapping
	@ResponseBody //formato json
	@RequestMapping("/buscarTablaDetalle")
	public ResponseEntity<List<TablaDetalle>> buscarTablaDetalle(@RequestBody TablaDetalle td){
		List<TablaDetalle> lista = tablaDetalleService.buscarTablaDetalle(td);
		return ResponseEntity.ok(lista);
	}

}
