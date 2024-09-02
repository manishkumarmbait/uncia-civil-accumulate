package com.uncia.unciacivilaccumulate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncia.unciacivilaccumulate.model.Cibil;
import com.uncia.unciacivilaccumulate.model.Response;
import com.uncia.unciacivilaccumulate.service.UnciaCibilService;

@RestController
@RequestMapping("/ruleservice")
public class UnciaCibilController {

	@Autowired
	private UnciaCibilService unciaCibilService;

	@PostMapping("/getOD")
	public ResponseEntity<Response> getRate(@RequestBody Cibil guarantorDeviation) {
		Response response = unciaCibilService.getResponse(guarantorDeviation);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
