package com.example.demo.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DadosFinais;
import com.example.demo.model.FaturamentoDistribuidora;
import com.example.demo.service.ServiceFatDistribuidora;

@RestController
@RequestMapping("/distribuidora")
public class FatDistribuidoraController {

	private final ServiceFatDistribuidora service;
	
	public  FatDistribuidoraController(ServiceFatDistribuidora service) {
		this.service=service;
	}
	
	
	
	@GetMapping("/faturamento")
	public  DadosFinais dadosFaturamento(@RequestBody List<FaturamentoDistribuidora>faturamentos) {

        double menor= service.menorFaturamento(faturamentos);
        double maior= service.maiorFaturamento(faturamentos);
        long diasAcimaMedia= service.acimaDaMedia(faturamentos);
        
       DadosFinais dto=new DadosFinais(menor, maior, diasAcimaMedia);
        
       return dto;
}
	}