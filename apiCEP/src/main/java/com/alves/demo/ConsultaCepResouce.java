package com.alves.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alves.demo.model.EnderecoCep;
import com.alves.demo.service.CepService;

@RestController
public class ConsultaCepResouce {

	@Autowired
	private CepService cepService;
	
	@ResponseBody
	@GetMapping(value = "/consultaCep/{cep}")
	public ResponseEntity<EnderecoCep> consultaCep(@PathVariable("cep")String cep){
		
		EnderecoCep cepConsulta = cepService.consultaCep(cep);
		
		return new ResponseEntity<EnderecoCep>(cepConsulta,HttpStatus.OK);
	}
	
}