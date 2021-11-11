package br.com.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.firstproject.beans.Films;
import br.com.firstproject.beans.User;
import br.com.firstproject.dao.FilmsDAO;
import br.com.firstproject.dao.UserDAO;

@RestController
public class FilmsController {
	@Autowired
	private FilmsDAO dao;

	@GetMapping("/films")
	public ResponseEntity<List <Films>> getAll(){
		List<Films> list = (List<Films>) dao.findAll();
		if(list.size() == 0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(list);
	}
}
