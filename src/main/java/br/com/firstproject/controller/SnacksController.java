package br.com.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.firstproject.beans.Snacks;
import br.com.firstproject.beans.User;
import br.com.firstproject.dao.SnacksDAO;
import br.com.firstproject.dao.UserDAO;

@RestController
@CrossOrigin("*")
public class SnacksController {
	@Autowired
	private SnacksDAO dao;

	@GetMapping("/snacks")
	public ResponseEntity<List <Snacks>> getAll(){
		List<Snacks> list = (List<Snacks>) dao.findAll();
		if(list.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/snacksId/{id}")
	public Snacks getById(@PathVariable int id){
		
		return dao.findById(id).orElse(null);
		
	}

}
