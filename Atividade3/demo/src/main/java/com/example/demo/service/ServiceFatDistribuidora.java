package com.example.demo.service;

import java.util.List;
import java.util.OptionalDouble;

import org.springframework.stereotype.Service;

import com.example.demo.model.FaturamentoDistribuidora;

@Service
public class ServiceFatDistribuidora {

	
	
	public double maiorFaturamento(List<FaturamentoDistribuidora> faturamento){
		 return faturamento.stream()
	                .filter(f -> f.getValor() > 0)
	                .mapToDouble(FaturamentoDistribuidora::getValor)
	                .max()
	                .orElse(0);
		
	}
	public double menorFaturamento(List<FaturamentoDistribuidora> faturamento){
		 return faturamento.stream()
	                .filter(f -> f.getValor() > 0) 
	                .mapToDouble(FaturamentoDistribuidora::getValor)
	                .min()
	                .orElse(0);
	}
	
	 public long acimaDaMedia(List<FaturamentoDistribuidora> faturamento) {
	        OptionalDouble media = faturamento.stream()
	                .filter(f -> f.getValor() > 0)
	                .mapToDouble(FaturamentoDistribuidora::getValor)
	                .average();

	        return media.isPresent() ? faturamento.stream()
	                .filter(f -> f.getValor() > 0 && f.getValor() > media.getAsDouble())
	                .count() : 0;
	    }
	
	
	
}

