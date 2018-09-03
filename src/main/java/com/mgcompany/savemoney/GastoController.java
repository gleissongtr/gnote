package com.mgcompany.savemoney;


import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gasto")
public class GastoController {

	@Autowired
	private GastoRepository gastoRepository;
	
	@GetMapping
	public ResponseEntity<Gasto> teste() {
		return new ResponseEntity<>(gastoRepository.save(new Gasto("1213",new BigDecimal(15),new Date())), HttpStatus.OK);
	}
	
	
}
