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

import com.empresa.entity.Paciente;
import com.empresa.service.PacienteService;

@RestController //controlador rest
@RequestMapping("/rest/paciente")
public class PacienteController {
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	@ResponseBody //formato json
	@RequestMapping("/cargaPaciente")
	public ResponseEntity<List<Paciente>> cargaPaciente(){
		List<Paciente> lista = pacienteService.cargarPaciente();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	@RequestMapping("/guardarPaciente")
	public ResponseEntity<Paciente> guardarPaciente(@RequestBody Paciente obj){
		Paciente objSalida = pacienteService.guardarPaciente(obj);
		return ResponseEntity.ok(objSalida);
	}
	
	@PostMapping
	@ResponseBody
	@RequestMapping("/buscarPaciente")
	public ResponseEntity<List<Paciente>> buscarPaciente(@RequestBody Paciente p){
		List<Paciente> pacientesList = pacienteService.buscarPaciente(p);
		return ResponseEntity.ok(pacientesList);
	}
	
	

}
