package br.com.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.firstproject.beans.Beverages;
import br.com.firstproject.dao.BeveragesDAO;

@RestController
public class BeveragesController {
	@Autowired
	private BeveragesDAO dao;

	@GetMapping("/beverages")
	public ResponseEntity<List <Beverages>> getAll(){
		List<Beverages> list = (List<Beverages>) dao.findAll();
		if(list.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(list);
	}
}
