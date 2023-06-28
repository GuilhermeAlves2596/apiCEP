package com.alves.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alves.demo.model.EnderecoCep;

@Service
public class CepService {

	public EnderecoCep consultaCep(String cep) {
		return new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cep+"/json/", EnderecoCep.class).getBody();
	}
}
