package com.sysone.costos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sysone.costos.domain.Automovil;
import com.sysone.costos.domain.AutomovilRepository;
import com.sysone.costos.dto.AutomovilDTO;

@Controller
public class AutomovilController {
	
	@Autowired
	private AutomovilRepository repository;
	
	@GetMapping(path = "/")
	public @ResponseBody String index() 
	{		
		return "indexOfAutomovilController";
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<AutomovilDTO> addNewVehiculo(@RequestBody AutomovilDTO model)
	{
		AutomovilDTO newModel = model.createNewDTO();
		repository.save(newModel.toEntity());
		return new ResponseEntity<AutomovilDTO>(newModel, HttpStatus.OK);
	}
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<AutomovilDTO> getAllVehiculos()
	{
		Iterable<Automovil> entitys = repository.findAll();
		List<AutomovilDTO> dtos = new ArrayList<AutomovilDTO>();
		for(Automovil automovil : entitys) {
			dtos.add(new AutomovilDTO(automovil));
		}
		return dtos;
	}
	
}
